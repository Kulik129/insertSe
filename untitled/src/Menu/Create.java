package Menu;

import java.sql.SQLException;

public interface Create {
    void dataEntry() throws SQLException;
    void yes_no() throws SQLException;
    void outputAll() throws SQLException;
    void deleteString() throws SQLException;
}
