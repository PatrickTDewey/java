// arrays have a fixed size, to add and remove from a array like data structure, we can use array list
import java.util.ArrayList;
public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers; // variable declaration
        numbers = new int[5]; // initialization
        numbers[0] = 4; // set value of numbers index 0 to 4
        numbers[1] = 10;
        numbers[2] = 0;
        numbers[3] = 2;
        numbers[4] = 6;
        String numberArrayString = "";
        for (int i = 0; i < numbers.length; i++) {
            numberArrayString += numbers[i] + ", ";
        }
        System.out.println(numberArrayString);
        // declaring and initializing on same line, as well as adding all the values to arr at once
        String[] snacks = {
                "Almonds",
                "Carrots",
                "Pepporoni",
                "SpaceX Shuttle",

        };
        System.out.println(String.join(", ", snacks));

        ArrayList<Object> firstArrayList = new ArrayList<Object>();
        firstArrayList.add(10);
        firstArrayList.add("Hi");
        firstArrayList.add(new ArrayList<String>());
        firstArrayList.add(new Double(3.21));
        Object numInArrayList = firstArrayList.get(0);
        System.out.println(numInArrayList);
        System.out.println(firstArrayList);
        // conventional for loop
        for (int i = 0; i < firstArrayList.size(); i++) {
            System.out.println(firstArrayList.get(i));
        }
        // enhanced for loop (for of)
        for (Object name:
             firstArrayList) {
            System.out.println(name);
        }
    }
}