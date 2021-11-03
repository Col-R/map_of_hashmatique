import java.util.HashMap;
public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Intro/End of the World", "We are the Champions, so wake me up before you go go");
        trackList.put("Who run the world?", "Metal, it comes from hell.");
        trackList.put("Soccer Face", "Suh-suh-suh Soccer Face. Suh-suh Soccer Face. Buh-buh Baseball.");
        trackList.put("Chinese Takeout", "WAKE UP! Galileo. WHY DON'T YOU PUT ON A LITTLE MAKE UP? Figaro. Magnifico.");
        System.out.println("The track requested: " + trackList.get("Chinese Takeout"));
        // for each item_value : array/list
        for (HashMap.Entry<String, String> track : trackList.entrySet()) {
            System.out.println(track.getKey() + ": " + track.getValue());
        }
    }
}