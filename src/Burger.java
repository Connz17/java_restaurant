public class Burger {

    private String type;
    private double price;
    private Topping topping1;
    private Topping topping2;
    private Topping topping3;
    private Topping topping4;
    private Topping topping5;
    private int toppingCount;
    private boolean deluxeBurger;

    public Burger(String type, double price) {
        this.type = type;
        this.price = price;

    }


    public double getPrice() {

        return price;
    }

    //overload this method with 3 different parameter calls
    public void addTopping(Topping topping) {
        if (deluxeBurger && toppingCount <= 5) {
            toppingCount += 1;
            switch (toppingCount) {
                case 1 -> topping1 = topping;
                case 2 -> topping2 = topping;
                case 3 -> topping3 = topping;
                case 4 -> topping4 = topping;
                case 5 -> topping5 = topping;
                default -> System.out.println("Topping could not be added");
            }
        } else {
            toppingCount += 1;
            switch (toppingCount) {
                case 1 -> topping1 = topping;
                case 2 -> topping2 = topping;
                case 3 -> topping3 = topping;
                default -> System.out.println("Topping could not be added");
            }
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", topping1=" + topping1 +
                ", topping2=" + topping2 +
                ", topping3=" + topping3 +
                ", topping4=" + topping4 +
                ", topping5=" + topping5 +
                '}';
    }
}