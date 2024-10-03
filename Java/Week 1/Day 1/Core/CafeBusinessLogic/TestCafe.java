package Core.CafeBusinessLogic;

import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        System.out.println("*---------STREAK GOAL TEST-----------*");

        CafeUtil appTest = new CafeUtil();
        Integer testRewards = appTest.getStreakGoal(5);

        System.out.println(testRewards);

        System.out.println("*---------TOTAL ORDER TEST-----------*");

        double[] prices = { 1.2, 2.3, 4.12, 3.1 };
        Double orderTotal = appTest.getOrderTotal(prices);
        System.out.println(orderTotal);

        System.out.println("*---------DISPLAY MENU TEST-----------*");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Drop Coffee");
        menu.add("Cappuccino");
        menu.add("Latte");
        menu.add("Mocha");

        appTest.displayMenu(menu);

        System.out.println("*---------ADD CUSTOMER TEST-----------*");

        ArrayList<String> customer = new ArrayList<String>();

        for (int i = 0; i < 2; i++) {
            appTest.addCustomer(customer);
            System.out.println("\n");
        }
        System.out.println("*---------DISPLAY PRODUCT PRICE CHART TEST-----------*");

        appTest.printPriceChart("Italian Coffee Beans", 12, 4);

    }
}
