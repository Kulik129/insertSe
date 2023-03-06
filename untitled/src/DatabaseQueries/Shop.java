package DatabaseQueries;

import ConnectDB.Connect;
import ConnectDB.DBProcessor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Shop {
    private String shop;
    private int onHand;
    public Shop() {
    }
    public Shop(String shop, int onHand) {
        this.shop = shop;
        this.onHand = onHand;
    }
    public String getShop() {
        return shop;
    }
    public int getOnHand() {
        return onHand;
    }
    public void sss() throws SQLException {
        DBProcessor dbProcessor = new DBProcessor();
        Connection connection = dbProcessor.getConnection(Connect.getUrl(), Connect.getUser(), Connect.getPassword());
        String query = "select shop, onHand from salary_jan";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            String shop = resultSet.getString("shop");
            int onHand = resultSet.getInt("onHand");
            Shop salary = new Shop(shop, onHand);
            System.out.println(salary);
        }
        statement.close();
        connection.close();
    }
}
