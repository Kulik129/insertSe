public class ShopIn extends Shop{
    private int total;
    public ShopIn(String shop, int onHand, int total ){
        super(shop,onHand);
        this.total=total;
    }

    @Override
    public String toString() {
        return "ShopIn{" +
                "total=" + total +
                ", shop='" + shop + '\'' +
                ", onHand=" + onHand +
                '}';
    }

}
