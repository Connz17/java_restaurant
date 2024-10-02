public class Main {
    public static void main(String[] args) {

        MealOrder order = new MealOrder();
        System.out.println(order);
        System.out.println(MealOrder.getPrice(order));

//        MealOrder order2 = new MealOrder(new Burger("Hamburger", 5.00),new Drink("Fanta", "small"), new SideItem("Wings"), false);
//        System.out.println(order2);
//        System.out.println(MealOrder.getPrice(order2));
    }
}