package DatabaseQueries;

import ConnectDB.Connect;
import ConnectDB.DBProcessor;
import Menu.Create;

import java.sql.*;

public class Query implements Create {
    DBProcessor dbProcessor = new DBProcessor();
    Connection connection = dbProcessor.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());

    public Query() throws SQLException {
    }

    @Override
    public void create() throws SQLException {
        String CREATE = " CREATE TABLE salary_feb(`id` INT AUTO_INCREMENT PRIMARY KEY,`shop` VARCHAR(45),`date` DATE,`onHand` INT,`inSalary` INT,`total` INT)";
        PreparedStatement preparedSt = connection.prepareStatement(CREATE);
        preparedSt.execute();
        connection.close();
    }

    @Override
    public void delete(String query, String whyDelete) throws SQLException {
        PreparedStatement preparedSt = connection.prepareStatement(query);
        preparedSt.setString(1, whyDelete);
        preparedSt.executeUpdate();
    }

    @Override
    public void outputtingAll(String query) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String shop = resultSet.getString("shop");
            String date = resultSet.getString("date");
            int onHand = resultSet.getInt("onHand");
            int inSalary = resultSet.getInt("inSalary");
            int total = resultSet.getInt("total");
            Salary salary = new Salary(id, shop, date, onHand, inSalary, total);
            System.out.println(salary);
        }
        statement.close();
        connection.close();
    }


    public void insert(String INSERT, String shop, String date, int salary) throws SQLException {
        PreparedStatement preparedSt = connection.prepareStatement(INSERT);
        preparedSt.setString(1, shop);
        preparedSt.setString(2, date);
        preparedSt.setInt(3, salary);
        preparedSt.executeUpdate();
    }


    public void outputShopTotalOnHand() throws SQLException {
        String query = "select shop, onHand, total from salary_jan";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String shop = resultSet.getString("shop");
            int onHand = resultSet.getInt("onHand");
            int total = resultSet.getInt("total");
            ShopIn salary = new ShopIn(shop, onHand, total);
            System.out.println(salary);
        }
        statement.close();
        connection.close();
    }
}
