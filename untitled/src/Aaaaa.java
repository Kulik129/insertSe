import java.sql.SQLException;

public class Aaaaa {

    String INSERT = "SELECT * FROM salary.salary_dec";

    public String getINSERT() {
        return INSERT;
    }

    public void v() throws SQLException {




        Query qw = new Query();
        qw.outputtingAll(getINSERT());


//        NewQuery newQuery = new NewQuery();
//        newQuery.insert(getINSERT());
//        INSERT INTO salary.salary_dec (shop,date,on_hand, total) VALUES (?,?,?,?)


//        String DELETE = "DELETE FROM salary_dec WHERE shop = ?";
//        String whyDelete = "dasvsa";
//        qw.delete(DELETE,whyDelete);


//        String query = "SELECT * FROM salary.salary_dec";
//        qw.outputting(query);




//        qw.insert(getINSERT());



//        newQuery.insert(INSERT);
//        String INSERT = "INSERT INTO salary.salary_dec (shop,date,on_hand) VALUES (?,?,?)";

    }
}
