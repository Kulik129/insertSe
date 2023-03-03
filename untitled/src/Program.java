import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    String INSERT = "INSERT INTO salary.salary_dec (shop,date,on_hand) VALUES (?,?,?)";
    String s = "ammm";
    String d = "11.11.2022";
    int w = 123456;

    public void mai() throws SQLException {
        New sam = new New(INSERT, d, 12222);

        DBProcessor dbProcessor = new DBProcessor();
        Connection connection = dbProcessor.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());


        PreparedStatement preparedSt = connection.prepareStatement(INSERT);
        preparedSt.setString(1, s);
        preparedSt.setString(2, d);
        preparedSt.setInt(3, w);
        preparedSt.executeUpdate();

        sam.display();
    }
}
