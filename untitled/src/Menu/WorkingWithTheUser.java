package Menu;

import DatabaseQueries.NewQuery;

import java.sql.SQLException;
import java.util.Scanner;

public class WorkingWithTheUser extends Menu implements Create {
    NewQuery newQuery = new NewQuery();
    public WorkingWithTheUser() throws SQLException {
    }
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

    @Override
    public void outputAll() throws SQLException {
        String select = "SELECT * FROM salary_jan";
        Scanner in = new Scanner(System.in);
        newQuery.outputtingAll(select);
        System.out.println("Нажмите Y если желаете продолжить");
        String ch = in.next();
        if (ch.equals("y")) {
            navigation();
        }
        in.close();
    }

    @Override
    public void deleteString() throws SQLException {
        String delete = "DELETE FROM salary_jan WHERE shop = ?";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название магазина");
        String sh = in.next();
        newQuery.delete(delete, sh);
        System.out.println("Нажмите Y если желаете продолжить");
        String ch = in.next();
        if (ch.equals("y")) {
            navigation();
        }
        in.close();
    }

    public void yes_no() throws SQLException {
        Scanner iScanner1 = new Scanner(System.in);
        System.out.println("Введите ДА если хотите продолжить заполнять таблицу!\nВведите НЕТ для выхода в меню!");
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
