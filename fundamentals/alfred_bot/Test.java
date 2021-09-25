public class Test {
    public static void main(String[] args) {
        // make an instance of AlferdQuotes to access it's methods.
        AlfredQuotes alfred = new AlfredQuotes();

        // Make some test greetings
        String testGreet1 = alfred.greetMasterWayne();
        String testGreet2 = alfred.guestGreeting("Patrick");
        String testGreet3 = alfred.guestGreeting("Vicki");
        String testGreet4 = alfred.guestGreeting("Vicki", alfred.dateAnnouncement());
        int nameLength = alfred.getNameLength("Patrick");
        String alexisTest1 = alfred.respondBeforeAlexis(
                "Alexis, play some low-fi study music."
        );
        String alexisTest2 = alfred.respondBeforeAlexis(
                "I can't find my yo-yo....Maybe alfred knows where it is."
        );
        String alexisTest3 = alfred.respondBeforeAlexis(
                "Maybe that's what batman is about. Not winning, but failing."
        );
        System.out.println(testGreet1);
        System.out.println(testGreet2);
        System.out.println(testGreet3);
        System.out.println(testGreet4);
        System.out.println(alexisTest1);
        System.out.println(alexisTest2);
        System.out.println(alexisTest3);
        System.out.println(nameLength);
    }
}