import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ClassCastException extends Exception {
};

public class ExceptionExample {

    public ArrayList<Object> assignToInt(ArrayList<Object> arrayOfObjects) {
        for (Object item :
                arrayOfObjects) {
            try {
                Integer castedToInt = (Integer) item;
                System.out.println(castedToInt);
            } catch (Exception e){
                System.out.println(e);
//                throw new ClassCastException();
            }
        }

        return arrayOfObjects;
    }
}