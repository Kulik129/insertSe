package DatabaseQueries;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewQuery extends Query {
    public NewQuery() throws SQLException {
    }


    public void insert(String INSERT, String shop, String date, int inSalary, int total) throws SQLException {
        PreparedStatement preparedSt = connection.prepareStatement(INSERT);
        preparedSt.setString(1, shop);
        preparedSt.setString(2, date);
        preparedSt.setInt(3, inSalary);
        preparedSt.setInt(4, total);
        preparedSt.executeUpdate();
    }

    public void insert5parameters(String INSERT, String shop, String date, int onHand, int inSalary, int total) throws SQLException {
        PreparedStatement preparedSt = connection.prepareStatement(INSERT);
        preparedSt.setString(1, shop);
        preparedSt.setString(2, date);
        preparedSt.setInt(3, onHand);
        preparedSt.setInt(4, inSalary);
        preparedSt.setInt(5, total);
        preparedSt.executeUpdate();
    }

    public void ds(){
        Salary cc = new Salary(1,"as","wq",3,4,5);


    }
}
