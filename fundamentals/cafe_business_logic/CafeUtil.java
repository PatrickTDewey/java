import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {

    public Integer getStreakGoal(int numberOfWeeks) {
        int drinks = 0;
        for (int i = 1; i <= numberOfWeeks; i++) {
            drinks += i;
        }
        return drinks;
    }

    public String printPriceChart(String productName, double productPrice, int maxProductPerCustomer) {
        double accumulator = 0;
        double discount = 0;
        String printedPriceChart = "";
        for (int i = 0; i < maxProductPerCustomer; i++) {

            accumulator += (productPrice - discount);
            printedPriceChart += (i + " - " + String.format("$%.2f \r\n", accumulator));
            discount += .50;
            System.out.println(discount);
        }
        System.out.println(productName);
        return printedPriceChart;
    }

    public String getOrderTotal(double[] orderArr) {
        double total = 0;
        for (int i = 0; i < orderArr.length; i++) {
            total += orderArr[i];
        }
        return String.format("Order Total: $%.2f \r\n", total);
    }

    public String displayMenu(ArrayList<String> menuItemNames, ArrayList<Double> menuItemPrices) {
        String displayMenuString = "";
        for (int i = 0; i < menuItemNames.size(); i++) {
            displayMenuString += "Item ID: " +
                    i + ", Item:" + menuItemNames.get(i) + " -- " + String.format("$%.2f\r\n", menuItemPrices.get(i));
        }
        return displayMenuString;
    }
    public ArrayList<String> addOneCustomer(ArrayList<String> customerArray) {
        System.out.println("Please enter customer name: ");
        String userName = System.console().readLine();
        customerArray.add(userName);
        System.out.println("Hello "+ userName + " ,\r\n" +"There are "+ (customerArray.size() - 1)+" people ahead of you.");
        return customerArray;

    }
    public ArrayList<String> addCustomer(ArrayList<String> customerArray) {
        while (true) {
            System.out.println("Please enter customer name or press 'q' to quit: ");
            String userName = System.console().readLine();
            if (userName.equals("q")){
                break;
            }

            customerArray.add(userName);

        }
        return customerArray;
    }
}