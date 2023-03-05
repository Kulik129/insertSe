import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aaaaa {
    public void v() throws SQLException {
        NewQuery newQuery = new NewQuery();

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Нажмите 1 если желаете добавить запись в таблицу\n" + "Нажмите 2 если желаете посмотреть весь заработок\n" + "Нажмите 3 если желаете удалить\n");
            int as = in.nextInt();

            if (as == 1) {
                String INSERT = "INSERT INTO salary.salary_jan (shop,date, in_salary) VALUES (?,?,?)";

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
                String select = "SELECT * FROM salary_jan";
                newQuery.outputtingAll(select);
                v();
            }
            if (as == 3) {
                String delete = "DELETE FROM salary_jan WHERE shop = ?";
                System.out.println("введите название магазина");
                String sh = in.next();
                newQuery.delete(delete, sh);
                v();
            }
            if (as == 4) {
                String INSERT = "INSERT INTO salary.salary_jan (shop,date,onHand,inSalary,total) VALUES (?,?,?,?,?)";
                System.out.println("Введите название магазина");
                String shop = in.next();
                System.out.println("Ведите год-месяц-дату: ");
                String date = in.next();
                System.out.println("Введите зп на руки");
                int onHand = in.nextInt();
                System.out.println("Введите сумму которая ушла в зп");
                int inSalary = in.nextInt();
                int total = onHand + inSalary;
                System.out.println("з/п за день = " + total);
                newQuery.insert5parameters(INSERT, shop, date, onHand, inSalary, total);
                v();
            }
        }catch (InputMismatchException e){
            System.out.println("!!!!");
            v();
        }

    }
}
