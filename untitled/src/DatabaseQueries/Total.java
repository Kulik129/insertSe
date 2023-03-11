package DatabaseQueries;

public class Total {
    int total;



    public Total() {
    }

    public Total(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Зарплата за месяц: " +
                total;
    }
}
