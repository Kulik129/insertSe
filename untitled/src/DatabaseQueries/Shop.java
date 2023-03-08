package DatabaseQueries;

import ConnectDB.Connect;
import ConnectDB.DBProcessor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Shop {
    String shop;
    int onHand;

    public Shop() {
    }

    public Shop(String shop, int onHand) {
        this.shop = shop;
        this.onHand = onHand;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shop='" + shop + '\'' +
                ", onHand=" + onHand +
                '}';
    }
}

