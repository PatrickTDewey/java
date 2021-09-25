import java.util.HashMap;
import java.util.Set;

public class HashMapJava {


    public String getSongNamesAndLyrics(HashMap<String, String> songs) {
        Set<String> keys = songs.keySet();
        for (String key :
                keys) {
            System.out.println("Song Name: " + key);
            System.out.println("**************");
            System.out.println("Lyrics:\r\n" + songs.get(key));
        }
        return null;
    }public String getOneSong(HashMap<String, String> songs, String title) {
        return songs.get(title);
    }
}