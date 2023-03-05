public class Salary {
    private int id;
    private String shop;
    private String date;
    private int onHand;
    private int inSalary;
    private int total;

    public Salary() {}

    public Salary(int id, String shop, String date, int onHand, int inSalary, int total) {
        this.id = id;
        this.shop = shop;
        this.date = date;
        this.onHand = onHand;
        this.inSalary = inSalary;
        this.total = total;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", магазин: '" + shop +
                ", дата: '" + date +
                ", на руки: " + onHand +
                ", в зарплату: " + inSalary +
                ", всего: " + total;
    }
}
