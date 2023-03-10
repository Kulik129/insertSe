package DatabaseQueries;

import java.sql.SQLException;

public interface CreateQuery {
    void create() throws SQLException;
    void delete(String query, String whyDelete) throws SQLException;
    void outputtingAll(String query) throws SQLException;
    void outputShopTotalOnHand() throws SQLException;
    void totalSalary() throws SQLException;
}
