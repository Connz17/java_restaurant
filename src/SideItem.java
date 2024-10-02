public class SideItem {

    private String type;
    private double price;


    public SideItem(String type) {
        this.type = type;
        this.price = 1.99;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "type='" + type + '\'' +
                '}';
    }
}
