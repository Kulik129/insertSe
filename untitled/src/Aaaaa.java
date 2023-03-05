import java.sql.SQLException;
import java.util.Scanner;

public class Aaaaa {
    public void v() throws SQLException {
        NewQuery newQuery = new NewQuery();
        Scanner in = new Scanner(System.in);
        System.out.println("Нажмите 1 если желаете добавить запись в таблицу\n" + "Нажмите 2 если желаете посмотреть весь заработок\n" + "Нажмите 3 если желаете удалить\n");
        int as = in.nextInt();

        if (as == 1) {
            String INSERT = "INSERT INTO salary.salary_dec (shop,date, in_salary) VALUES (?,?,?)";

            System.out.println("введите имя магазина");
            String shop = in.next();
            System.out.println("введите дату");

            String date = in.next();
            System.out.println("введите зп");

            int inSalary = in.nextInt();
            newQuery.insert(INSERT, shop, date, inSalary);
            v();
        }
        if (as == 2) {
            String select = "SELECT * FROM salary_dec";
            newQuery.outputtingAll(select);
            v();
        }
        if (as == 3) {
            String delete = "DELETE FROM salary_dec WHERE shop = ?";
            System.out.println("введите название магазина");
            String sh = in.next();
            newQuery.delete(delete, sh);
            v();
        }
        if (as == 4) {
            String INSERT = "INSERT INTO salary.salary_dec (shop,date,on_hand,in_salary,total) VALUES (?,?,?,?,?)";
            System.out.println("введите название магазина");
            String shop = in.next();
            System.out.println("введите дату");
            String date = in.next();
            System.out.println("введите зп на руки");
            int onHand = in.nextInt();
            System.out.println("введите сумму которая ушла в зп");
            int inSalary = in.nextInt();
            int total = onHand + inSalary;
            System.out.println("зп зп день = " + total);
            newQuery.insert5parameters(INSERT, shop, date, onHand, inSalary, total);
            v();
        }
    }
}
