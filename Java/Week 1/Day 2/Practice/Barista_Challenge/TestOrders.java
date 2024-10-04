public class TestOrders {
    public static void main(String[] args) {
        Order guest1 = new Order();
        Order guest2 = new Order();
        Order Cindhuri = new Order("Cindhuri");
        Order Sam = new Order("Sam");
        Order Jimmy = new Order("Jimmy");

        Item item1 = new Item("mocha", 2.5);
        Item item2 = new Item("drip coffee", 2.7);
        Item item3 = new Item("latte", 2.0);
        Item item4 = new Item("cappiccino", 3.0);

        // guest1.display();
        // guest2.display();

        // order.
        // Cindhuri.display();
        // Sam.display();
        // Jimmy.display();

        guest1.addItem(item1);
        guest2.addItem(item2);
        guest1.setReady(true);
        guest1.getOrderTotal();
        guest1.display();
        System.out.println("=====TOTAL===== " + guest1.getOrderTotal());

        guest2.addItem(item4);
        guest2.addItem(item1);
        guest2.setReady(false);
        guest2.getOrderTotal();
        guest2.display();
        System.out.println("=====TOTAL===== " + guest2.getOrderTotal());

        Cindhuri.addItem(item2);
        Cindhuri.addItem(item2);
        Cindhuri.setReady(false);
        Cindhuri.getOrderTotal();
        Cindhuri.display();
        System.out.println("=====TOTAL===== " + Cindhuri.getOrderTotal());

        Sam.addItem(item3);
        Sam.addItem(item2);
        Sam.setReady(true);
        Sam.getOrderTotal();
        Sam.display();
        System.out.println("=====TOTAL===== " + Sam.getOrderTotal());

        Jimmy.addItem(item3);
        Jimmy.addItem(item2);
        Jimmy.setReady(false);
        Jimmy.getOrderTotal();
        Jimmy.display();
        System.out.println("=====TOTAL===== " + Jimmy.getOrderTotal());
    }
}
