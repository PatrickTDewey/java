import java.util.Random;
class outOfGasException extends Exception{}
public class UnreliableFriend {
    public boolean deliverMessage() throws outOfGasException{
        Random r = new Random();
        boolean hasGas = r.nextBoolean();
        if (hasGas) {
            return true;
        }
        throw new outOfGasException();
    }
}