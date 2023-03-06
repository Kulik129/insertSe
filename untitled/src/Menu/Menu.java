package Menu;

import DatabaseQueries.NewQuery;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void navigation() throws SQLException {
        NewQuery newQuery = new NewQuery();

        try {
            Scanner in = new Scanner(System.in);
            System.out.println(
                    "+-----------------------------------------------------+\n" +
                            "\tНажмите 1 если желаете добавить запись в таблицу\n" +
                            "+-----------------------------------------------------+\n" +
                            "\tНажмите 2 если желаете посмотреть весь заработок\n" +
                            "+-----------------------------------------------------+\n" +
                            "\tНажмите 3 если желаете удалить\n" +
                            "+-----------------------------------------------------+\n" +
                            "\tНажмите 4 для заполнения всех столбцов\n" +
                            "+-----------------------------------------------------+\n");
            int choice = in.nextInt();


            if (choice == 1) {
                String INSERT = "INSERT INTO salary.salary_jan (shop, date, inSalary) VALUES (?,?,?)";

                System.out.println("введите имя магазина");
                String shop = in.next();
                System.out.println("Ведите год-месяц-дату:");

                String date = in.next();
                System.out.println("введите зп");

                int inSalary = in.nextInt();
                newQuery.insert(INSERT, shop, date, inSalary);
                System.out.println("Нажмите Y если желаете продолжить");
                String ch = in.next();
                if (ch.equals("y")) {
                    navigation();
                }

            }
            if (choice == 2) {
                String select = "SELECT * FROM salary_jan";
                newQuery.outputtingAll(select);
                System.out.println("Нажмите Y если желаете продолжить");
                String ch = in.next();
                if (ch.equals("y")) {
                    navigation();
                }

            }
            if (choice == 3) {
                String delete = "DELETE FROM salary_jan WHERE shop = ?";
                System.out.println("введите название магазина");
                String sh = in.next();
                newQuery.delete(delete, sh);
                String ch = in.next();
                if (ch.equals("y")) {
                    navigation();
                }
            }
            if (choice == 4) {
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
                System.out.println("Нажмите Y если желаете продолжить");
                String ch = in.next();
                if (ch.equals("y")) {
                    navigation();
                }

            }
        } catch (InputMismatchException e) {
            System.out.println("!!!!");
            navigation();
        }

    }
}
