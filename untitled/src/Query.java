import java.sql.*;

public class Query {
    public void query() throws SQLException {
        DBProcessor dbProcessor = new DBProcessor();
        Connection connection = dbProcessor.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
        String query = "SELECT * FROM salary.salary_dec";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String shop = resultSet.getString("shop");
            String date = resultSet.getString("date");
            int onHand = resultSet.getInt("on_hand");
            int inSalary = resultSet.getInt("in_salary");
            int total = resultSet.getInt("total");
            Salary salary = new Salary(id, shop, date, onHand, inSalary, total);
            System.out.println(salary);
        }
        statement.close();
        connection.close();
    }
    public void queryP()throws SQLException{
        DBProcessor dbProcessor = new DBProcessor();
        Connection connection = dbProcessor.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
        String SELECT = "SELECT * FROM salary.salary_dec";
        String DELETE = "DELETE FROM salary_dec WHERE shop = ?";
        String INSERT = "INSERT INTO salary.salary_dec (shop) VALUES (?)";
        PreparedStatement preparedSt = connection.prepareStatement(DELETE);
        preparedSt.setString(1,"wth");
        preparedSt.execute();

        PreparedStatement preparedStatement = connection.prepareStatement(SELECT);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")+"\t"+resultSet.getString("shop"));
        }
        preparedStatement.close();
        connection.close();
    }
    public void createTable()throws SQLException{
        DBProcessor dbProcessor = new DBProcessor();
        Connection connection = dbProcessor.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
        String CREATE = "CREATE TABLE salary_jan\n" +
                "\n" +
                "(\n" +
                "\t`id` INT AUTO_INCREMENT PRIMARY KEY,\n" +
                "    `shop` VARCHAR(45),\n" +
                "    `date` DATE,\n" +
                "    `onHand` INT,\n" +
                "    `inSalary` INT,\n" +
                "    `total` INT\n" +
                ");";
        PreparedStatement preparedSt = connection.prepareStatement(CREATE);
        preparedSt.execute();

        connection.close();
    }
}
