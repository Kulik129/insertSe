public class Connection {
    private static String url = "jdbc:mysql://localhost:3306/salary";
    private static String user = "root";
    private static String password = "12345678";

    public static String getUrl() {
        return url;
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }
}
