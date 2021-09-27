

import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public ArrayList<Item> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Item> menu) {
        this.menu = menu;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price);
        menu.add(item);
    }


    public void displayMenu() {
        for (int i = 0; i < this.getMenu().size(); i++) {
            System.out.println(i+ " "+ this.getMenu().get(i).getName()+ " -- " + String.format("$%.2f",this.getMenu().get(i).getPrice()));
        }
    }

    public String toString() {
        return this.getClass().getSimpleName() + "\r\n" + this.getMenu() + "\r\n" + this.getOrders();
    }

    public ArrayList<Order> newOrder() {
        System.out.println("Please enter customer name for new order");
        String orderName = System.console().readLine();
        Order order = new Order(orderName);
        System.out.println("Enter the number of the menu item you would like to add to your order.");
        String itemNumber =  System.console().readLine();
        while (!itemNumber.equals("q")) {
            try {
                order.addItem(this.getMenu().get(Integer.parseInt(itemNumber)));
                itemNumber = System.console().readLine();
            } catch(Exception e){
                System.out.println(e);
                System.out.println("There is no menu item with that index");
                itemNumber = System.console().readLine();
            }
        }
        this.getOrders().add(order);
        System.out.println(order);
        return this.getOrders();

    }
    public ArrayList<Item> addItemByInput(){
        System.out.println("Enter new item in format 'itemName itemPrice'. Press q to quit");
        String input = System.console().readLine();
        while(!input.equals("q")){
            String[] nameAndPrice = input.split(" ");
            System.out.println(nameAndPrice[0] + " "+ nameAndPrice[1]);
            this.addMenuItem(nameAndPrice[0], Double.parseDouble(nameAndPrice[1]));
        }
        return menu;

        
    }
}
