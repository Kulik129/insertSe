package Menu;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
//        Menu.Menu as = new Menu.Menu();
//        as.navigation();


//        DatabaseQueries.ShopIn s = new DatabaseQueries.ShopIn();
//        s.sss();
        NewQuery qw = new NewQuery();
        qw.outputShopTotalOnHand();




    }
}