import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price);
        this.menu.add(item);
        item.setIndex(menu.indexOf(item));
    }

    public void newOrder() {

        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        Order order = new Order(name);
        displayMenu();

        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        int i = Integer.parseInt(itemNumber);

        while (!itemNumber.equals("q")) {
            // Get the item object from the menu, and add the item to the order
            if (i >= 0 && i < menu.size()) {
                order.addItem(menu.get(i));
                order.getOrderTotal();
            } else {
                System.out.println("Incorrect value.");
            }
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details
        order.display();
    }

    public void displayMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out
                    .println(menu.get(i).getIndex() + "  " + menu.get(i).getName() + " -- $" + menu.get(i).getPrice());
        }
    }
}
