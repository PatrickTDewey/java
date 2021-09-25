public class Variables {
    public static void main(String[] args){
        int firstInt; // we can declare a variable without setting it's value.
        firstInt = 400; // we can assign a value to the variable later in our code.
        double pi = 3.14159265; // we can also declare and assign on the same line.
        boolean bool = true;
        char singleCharacter = 'A';
        long bigNumber = 41013278;
        String multipleCharacters = "ABC";
        // primitive data types lowercase, all object data types are Uppercase
        if (bool){
            System.out.println(bigNumber);
        } else if (3 < 10){
            System.out.println("3 is less then ten and bool is false");
        }else {
            System.out.println("Bool ain't true!");
        }
        String dojoStringA = new String("Dojo");
        System.out.println(dojoStringA == "Dojo");
        System.out.println(dojoStringA.equals("Dojo"));
        String dojoStringB = "Dojo";
        System.out.println(dojoStringB == "Dojo");
        System.out.println(dojoStringB.equals("Dojo"));
    }
}
