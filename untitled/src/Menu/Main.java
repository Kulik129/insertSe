package Menu;

import DatabaseQueries.Query;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
//        Menu as = new Menu();
//        as.navigation();
        Query q = new Query();
        q.create();
    }
}