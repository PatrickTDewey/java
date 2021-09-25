import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMapJava hasher = new HashMapJava();
        HashMap<String, String> songNameToLyricMap = new HashMap<String, String>();
        songNameToLyricMap.put("Example Song 1", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean gravida ante sed leo posuere placerat ac quis nibh. Fusce vehicula.");
        songNameToLyricMap.put("Example Song 2", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse dignissim felis at tempus molestie. Aenean vestibulum maximus ante, quis sollicitudin.");
        songNameToLyricMap.put("Example Song 3", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut purus fringilla, rhoncus ipsum sed, ullamcorper nulla. Phasellus tellus felis.");
        songNameToLyricMap.put("Example Song 4", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean lacinia augue a eros blandit, at gravida sem volutpat. Donec eget.");

//        hasher.getSongNamesAndLyrics(songNameToLyricMap);
        System.out.println(hasher.getOneSong(songNameToLyricMap, "Example Song 1"));
    }
}