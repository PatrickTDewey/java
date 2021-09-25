public class Strings {
    public static void main(String[] args) {
        String ninja = "Coding dojo is awesome";
        int length = ninja.length();
        String cat = "cat";
        String dog = "dog";
        String catDog = cat.concat(dog);
        String formatString = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        String indexOfString = "Welcome to the jungle.";
        int a = indexOfString.indexOf("Welcome");
        int b = indexOfString.indexOf("to the");
        int c = indexOfString.indexOf("jungle");
        String trimMe = "      I need a cut!       ";
        System.out.println("String length is : " + length);
        System.out.println(catDog);
        System.out.println(formatString);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(trimMe.trim());
        System.out.println(indexOfString.toLowerCase());
        System.out.println(indexOfString.toUpperCase());
        String x = new String("word");
        String y = new String("word");
        System.out.println(x == y); // false, not same object
        System.out.println(x.equals(y)); // true "word" is equal to "word" (same characters)
    }
}