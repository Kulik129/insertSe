import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBProcessor {
    private Connection connection;

    public Connection getConnection(String url, String username, String password) throws SQLException {
        if (connection != null) {
            return connection;
        }
        return connection = DriverManager.getConnection(url, username, password);
    }
}
