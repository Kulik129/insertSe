package Menu;

import DatabaseQueries.NewQuery;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void navigation() throws SQLException {
        WorkingWithTheUser action = new WorkingWithTheUser();
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
                            "\tНажмите 4 для чтобы посмотреть з/п на руки и всего за день\n" +
                            "+-----------------------------------------------------+\n"+
                            "\tНажмите 5 для чтобы посмотреть всю з/п за месяц \n" +
                            "+-----------------------------------------------------+\n");
            int choice = in.nextInt();


            if (choice == 1) {
                action.dataEntry();
            }
            if (choice == 2) {
                action.outputAll();
            }
            if (choice == 3) {
               action.deleteString();
            }
            if (choice == 4) {
                newQuery.outputShopTotalOnHand();
                System.out.println("Нажмите Y если желаете продолжить");
                String ch = in.next();
                if (ch.equals("y")) {
                    navigation();
                }
            }
            if (choice == 5) {
                newQuery.totalSalary();
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
