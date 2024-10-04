import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

        public static void main(String[] args) {
                HashMap<String, String> track = new HashMap<String, String>();
                track.put("Beautiful Day",
                                "The heart is a bloom Shoots up through the stony ground There's no room No space to rent in this town");
                track.put("Rehab",
                                "Ther tired to make go back to rehab, but I said, 'No, no, no' Yes, I've been black, but when I come back, you'll know, know, know");
                track.put("Seven Nation Army",
                                "I'm gonna fight'em off A seven nation army couldn't hold me back They're gonna rip it off Takin' their time right behind my back");
                track.put("Paper Planes",
                                "I fly like paper, get high like planes If you catch me at the border, I got visas in my name If you come around here, I make 'em all day I get one done in a second if you wait");

                String songName = track.get("Beautiful Day");
                System.out.println(songName);

                Set<String> title = track.keySet();
                for (String key : title) {
                        // System.out.println();
                        System.out.println("Track: " + key + "\nLyrics: " + track.get(key));
                }
        }
}
