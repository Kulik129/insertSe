package Menu;

import DatabaseQueries.NewQuery;

import java.sql.SQLException;
import java.util.Scanner;

public class In {
    public void dataEntry(Scanner inn) throws SQLException {
        NewQuery newQuery = new NewQuery();
        String INSERT = "INSERT INTO salary.salary_jan (shop,date,onHand,inSalary,total) VALUES (?,?,?,?,?)";
        System.out.println("Введите название магазина: ");
        String shop = inn.nextLine();
        System.out.println("Ведите год-месяц-дату: ");
        String date = inn.nextLine();
        System.out.println("Введите зп на руки");
        int onHand = inn.nextInt();
        System.out.println("Введите сумму которая ушла в зп");
        int inSalary = inn.nextInt();
        int total = onHand + inSalary;
        System.out.println("з/п за день = " + total);
        newQuery.insert5parameters(INSERT, shop, date, onHand, inSalary, total);
    }
}
