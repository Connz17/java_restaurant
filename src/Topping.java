public class Topping {

    private  String name;
    private String type;
    private double price;

    public Topping(String name) {
        this.name = name;
        this.type = switch (name.toLowerCase()){
            case "bacon", "chicken", "sausage" -> "meat";
            case "cheese", "egg" -> "dairy";
            case "onions", "lettuce", "tomato", "avocado" -> "veg";
            default -> "other";
        };
        this.price = (type.equalsIgnoreCase("meat")) ? 1.00 : (type.equalsIgnoreCase("dairy")) ? 0.50 : (type.equalsIgnoreCase("veg")) ? 0.20 : 0.0;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                '}';
    }
}
