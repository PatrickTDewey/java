public class DeliverMessageTest {
    public static void main(String[] args) {
        UnreliableFriend friend = new UnreliableFriend();
        try{
            friend.deliverMessage();
            System.out.println("The message was delivered");
        } catch (outOfGasException e){
            System.out.println(e);
            System.out.println("Hey I am out of gas");
        }
    }
}