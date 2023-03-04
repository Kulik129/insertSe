
import java.sql.SQLException;

public class NewQuery extends Query{
    public NewQuery() throws SQLException {
    }

    public void insert(String INS) throws SQLException {
        preparedSt.setString(1,"Plaza");
        preparedSt.setString(2,"12.12.1212");
        preparedSt.setInt(3,232323);
        preparedSt.setInt(4,232323);
        preparedSt.executeUpdate();
    }
}
