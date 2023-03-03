import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class New extends Con{

    private final int onHand;

    public New(String query, String nameShop, int onHand) {
        super(query, nameShop);
        this.onHand=onHand;
    }
}

