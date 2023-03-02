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
        String query = "SELECT * FROM salary.salary_dec";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("shop"));
        }
        preparedStatement.close();
        connection.close();
    }
}
