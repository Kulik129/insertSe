package DatabaseQueries;

public class ShopIn extends Shop {
    private int total;

    public int getTotal() {
        return total;
    }

    public ShopIn(String shop, int onHand, int total) {
        super(shop, onHand);
        this.total = total;
    }

    @Override
    public String toString() {
        return
                "Магазин: " + shop +
                        " З/п на руки: " + onHand +
                        " з/п за весь день: " + total;
    }
}
