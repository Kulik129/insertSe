import java.sql.*;

public class Con {
    String query;
    String nameShop;

    public String getQuery() {
        return query;
    }

    public String getNameShop() {
        return nameShop;
    }

    public Con(String query, String nameShop) {
        this.query = query;
        this.nameShop = nameShop;
    }

    public void display() throws SQLException {
        Connection connection = DriverManager.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
        PreparedStatement preparedStatement = connection.prepareStatement(query);

    }
}
