package Menu;

import java.sql.SQLException;

public interface Create {
    void create() throws SQLException;

    void delete(String query, String whyDelete) throws SQLException;


    void outputtingAll(String query) throws SQLException;

    void outputShopTotalOnHand() throws SQLException;
}
