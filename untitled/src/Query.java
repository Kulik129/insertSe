import java.sql.*;

public class Query {
    DBProcessor dbProcessor = new DBProcessor();
    Connection connection = dbProcessor.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
    public Query() throws SQLException {
    }
    public void insert(String INSERT, String shop, String date, int salary) throws SQLException {
        PreparedStatement preparedSt = connection.prepareStatement(INSERT);
        preparedSt.setString(1, shop);
        preparedSt.setString(2, date);
        preparedSt.setInt(3, salary);
        preparedSt.executeUpdate();
    }
    public void createTable() throws SQLException {
        String CREATE = "(\n" +
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
    public void delete(String query, String whyDelete) throws SQLException {

        PreparedStatement preparedSt = connection.prepareStatement(query);
        preparedSt.setString(1, whyDelete);
        preparedSt.executeUpdate();
    }
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
}
