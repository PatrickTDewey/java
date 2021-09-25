// import Date class from java.util package
import java.util.Date;

public class AlfredQuotes {
    public String greetMasterWayne() {
        return "Hello, lovely to see you Master Wayne. How are you?";
    }

    public String guestGreeting(String name) {
        return "Hello " + name + ", lovely to see you today.";
    }

    public String dateAnnouncement() {
        // get new Date instance
        Date date = new Date();
        // return the date
        return "The date today is: " + date;
    }
    public String guestGreeting(String name, String dateSentance){
        return "Hello " + name + ". Would you like to know the date? " + dateSentance;
    }
    public Integer getNameLength(String name){
        return name.length();
    }
    public String respondBeforeAlexis(String conversation) {
        // if conversation contains Alexis, respond snarky remark
        if (conversation.indexOf("Alexis") >= 0) {
            return conversation + "\r\nOh dear are you talking to that Tropic Bot again, Master Wayne?\r\nI wont stand for it\r\nAllow me to be of assistance instead.";
        }
        // else if conversation contains winning, tell Mr wayne to win
        else if (conversation.indexOf("winning") >= 0) {
            return conversation + "\r\nNo, you were right, it is about winning Master Wayne.";
        }
        // Else, just be a good butler.
        else {
            return conversation + "\r\nRight away, Master Wayne.";
        }

    }
}