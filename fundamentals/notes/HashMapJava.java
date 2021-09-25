import java.util.HashMap;
import java.util.Set;
public class HashMapJava {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("pdewey1@fake.com", "Patrick Dewey");
        userMap.put("fake@test.com", "Fred Faker");
        userMap.put("testfaker@fake.com", "Pump Fake");
        String name = userMap.get("fake@test.com");
        System.out.println("Full name of this user is " + name);

        Set<String> keys = userMap.keySet();
        for (String key:
             keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}