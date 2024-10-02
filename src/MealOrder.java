public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem side;
    private boolean deal;

    public MealOrder() {
        burger = new Burger("Hamburger", 3.99);
        drink = new Drink("Coke", "Medium");
        side = new SideItem("Fries");

    }

    public MealOrder(Burger burger, Drink drink, SideItem side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

//    public MealOrder(String burger, String drink, String side) {
//        this.burger = new Burger(burger);
//        this.drink = new Drink(drink, );
//        this.side = side;
//    }


    public void setDeal(boolean deal) {
        this.deal = deal;
    }

    public static double getPrice(MealOrder meal){
        double total;
        total = meal.side.getPrice() + meal.burger.getPrice() + meal.drink.getPrice();
        if (meal.deal){
           return total / 0.10;
        }
        return total;
    }

    @Override
    public String toString() {
        return "MealOrder{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", side=" + side +
                '}';
    }
}
