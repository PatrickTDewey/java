public class Casting {
    public static void main(String[] args) {
        // int size 4 byte -2,147,483,648 to + **7
        int i = 120;
        // byte size 1 byte range -128 to 127
        byte b = (byte) i;

        byte c = 127;
        int j = c;

        double doubleNumber = 39.4923;
        int doubleToInt = (int) doubleNumber;
        System.out.println(b);
        System.out.println(j);
        System.out.println(doubleToInt);


    }
}