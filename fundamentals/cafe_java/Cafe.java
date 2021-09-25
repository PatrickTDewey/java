public class Cafe {
    public static void main(String[] args) {
        // App Vars
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready.";
        String displayTotalMessage = "Your total is $";
        // Menu Vars
        double mochaPrice = 3.5;
        double dripCoffee = 3.2;
        double latte = 4.0;
        double cappucino = 5.0;

        // Customer Vars
        String customer1 = "Cindhuri";
        String customer2 = "Patrick";
        String customer3 = "Spencer";
        String customer4 = "Vinny";

        // Order Completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1){
            System.out.println(readyMessage);
        } else {
            System.out.println(pendingMessage);
        }
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2){
            System.out.println(readyMessage + displayTotalMessage + mochaPrice);
        } else {
            System.out.println(pendingMessage);

        }
        System.out.println(generalGreeting + customer3);
        if (isReadyOrder3){
            System.out.println(readyMessage + displayTotalMessage + latte*2);
        } else {
            System.out.println(pendingMessage);
        }
        System.out.println(customer4+", You owe $" + String.format("%.2f",cappucino-dripCoffee));
    }
}
