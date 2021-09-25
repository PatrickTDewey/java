import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Create an instance of the CafeUtil class
        CafeUtil cafe = new CafeUtil();

        // Test Cases:
        int drinkGoal = cafe.getStreakGoal(10);
        System.out.printf("--------STREAK GOAL TEST---------\r\nPurchases needed by week 10: %s\r\n", drinkGoal);

        double[] orderItems = {3.5,1.5,4.0,4.5};

        List<String> loadMenu = Arrays.asList("drip coffee", "cappucino", "latte", "mocha");
        List<Double> loadPrices = Arrays.asList(1.5, 3.5, 4.5, 3.5);

        ArrayList<String> items = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();

        items.addAll(loadMenu);
        prices.addAll(loadPrices);

        ArrayList<String> customers = new ArrayList<String>();
        List<String> customerList = Arrays.asList("Patty", "Jared", "Mike");
        customers.addAll(customerList);

        String testPriceChart = cafe.printPriceChart("Large Drip Arabia", 32.3, 4);
        System.out.println(testPriceChart);
        System.out.println(cafe.getOrderTotal(orderItems));
        System.out.println(cafe.displayMenu(items, prices));

        System.out.println(cafe.addCustomer(customers));
        System.out.println(cafe.addOneCustomer(customers));

    }
}