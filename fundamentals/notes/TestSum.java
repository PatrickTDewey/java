public class TestSum {
    public static void main(String[] args) {
        long startObj = System.currentTimeMillis();
        Integer sumIntObject = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            sumIntObject += i;
        }
        long endObj = System.currentTimeMillis();
        double totalObj = (double) (endObj - startObj) / 1000;



        long startPrim = System.currentTimeMillis();
        int sumIntPrim = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            sumIntPrim += i;
        }
        long endPrim = System.currentTimeMillis();
        double totalPrim = (double) (endPrim - startPrim) / 1000;


        System.out.println("Time of execution of Int Object in s: "+ totalObj);
        System.out.println("Sum: " + sumIntObject);
        System.out.println("Time of execution of Int Prim in s: "+ totalPrim);
        System.out.println("Sum: " + sumIntPrim);
        // Objects can point to null, primitive data types cannot.
        Integer nullTest = 35;
        nullTest = null;
        System.out.println(nullTest);
    }
}