package Core.CafeBusinessLogic;

import java.util.ArrayList;

public class CafeUtil {
    public Integer getStreakGoal(Integer numWeeks) {
        int sum = 0;
        for (int i = 0; i <= numWeeks; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public Double getOrderTotal(double[] price) {
        double total = 0.0;
        for (int i = 0; i < price.length; i++) {
            total = total + price[i];
        }
        return total;
    }

    void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            int index = menuItems.indexOf(menuItems.get(i));
            String ele = menuItems.get(i);
            System.out.println(index + ": " + ele);
        }
    }

    void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String username = System.console().readLine();
        Integer index = 0;

        customers.add(username);
        for (int j = 0; j < customers.size(); j++) {
            index = customers.indexOf(customers.get(j));
        }

        System.out.println("Hello, " + username + ", there are " + index + " people infront of you.");
        System.out.println(customers);
    }

    void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);

        for (int i = 0; i < maxQuantity; i++) {
            double x = 0.5;
            x = i * 0.5;
            // System.out.println((i + 1) + " - $" + price * (i + 1)); NINJA BONUS 1
            System.out.format("%d - $%.2f \n", (i + 1), ((price * (i + 1)) - x)); // NINJA BONUS 2 + NINJA BONUS 3
        }
    }
}
