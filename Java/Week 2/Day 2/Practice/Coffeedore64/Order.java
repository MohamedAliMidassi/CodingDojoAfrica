import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<>();
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item1) {
        this.items.add(item1);
    }

    public String getStatusMessage() {
        if (isReady()) {
            return "Your order is ready!";
        } else {
            return "Thank you for waiting. Your order will be ready soon!";
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for (int i = 0; i < this.items.size(); i++) {
            total = total + this.items.get(i).getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Your Customer Details are:");
        System.out.println("Customer's Name: " + this.name);
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println(this.items.get(i).getName() + " - $" + this.items.get(i).getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
