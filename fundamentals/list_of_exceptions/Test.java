import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        ArrayList<Object> objectList = new ArrayList<Object>();
        List<Object> addObjects = Arrays.asList("13", "hello world", 48, "Goodbye World");
        objectList.addAll(addObjects);
            example.assignToInt(objectList);
//        try{
//            example.assignToInt(objectList);
//        } catch (ClassCastException e){
//            System.out.println(e);
//            System.out.println("Cannot cast to integer");
//        }
    }
}