package Menu;

import DatabaseQueries.NewQuery;

import java.sql.SQLException;
import java.util.Scanner;

public class In extends Menu {
    public void dataEntry() throws SQLException {
        NewQuery newQuery = new NewQuery();
        Scanner inn = new Scanner(System.in);
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
        yes_no();
    }

    public void yes_no() throws SQLException {
        Scanner iScanner1 = new Scanner(System.in);
        System.out.println("Введите ДА если хотите продолжить!\nВведите НЕТ если хотите остановить!");
        String message = iScanner1.next();
        switch (message.toLowerCase()) {
            case "да":
                dataEntry();
                break;
            case "нет":
                navigation();
                break;
        }
        iScanner1.close();
    }
}
