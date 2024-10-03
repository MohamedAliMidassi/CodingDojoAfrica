public class TestOrders {
    public static void main(String[] args) {
        CoffeeKiosk menu = new CoffeeKiosk();
        menu.addMenuItem("Mocha", 2.00);
        menu.addMenuItem("Espresso", 1.50);

        menu.newOrder();
    }
}
