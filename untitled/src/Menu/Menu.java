package Menu;

import DatabaseQueries.NewQuery;
import DatabaseQueries.Query;

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
                            "\tНажмите 4 для чтобы посмотреть з/п на руки и всего за день\n" +
                            "+-----------------------------------------------------+\n");
            int choice = in.nextInt();


            if (choice == 1) {
                In i = new In();
                i.dataEntry();
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
                System.out.println("Нажмите Y если желаете продолжить");
                String ch = in.next();
                if (ch.equals("y")) {
                    navigation();
                }
            }
            if (choice == 4) {
                NewQuery qw = new NewQuery();
                qw.outputShopTotalOnHand();
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
