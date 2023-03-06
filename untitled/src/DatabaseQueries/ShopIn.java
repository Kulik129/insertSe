package DatabaseQueries;

public class ShopIn extends Shop{
    private int total;
    public ShopIn(String shop, int onHand, int total ){
        super(shop,onHand);
        this.total=total;
    }
    Shop s =  new Shop();
    @Override
    public String toString() {
        return "DatabaseQueries.ShopIn{" +
                "total=" + total +
                ", shop='" + s.getShop() + '\'' +
                ", onHand=" + s.getOnHand() +
                '}';
    }
}
