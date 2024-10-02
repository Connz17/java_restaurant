public class Drink {

    private String type;
    private String size;
    private double price;


    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        this.price = (size.equalsIgnoreCase("small")) ? 0.99 : (size.equalsIgnoreCase("medium")) ? 2.99 : 5.99;

    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
