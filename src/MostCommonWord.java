import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
    /*
    52.23%
     */
    public static String mostCommonWord(String paragraph, String[] banned) {
        int max = 0;
        String sol = "";
        String[] splitedString = paragraph.split("\\P{Alpha}+");
        Map<String,Integer> frequencyMap = new HashMap<>();

        for(String s: splitedString){
            frequencyMap.put(s.toLowerCase(), frequencyMap.getOrDefault(s.toLowerCase(),0) + 1);
        }

        Set<String> bannedSet = new HashSet<>();

        for(String s: banned){
            bannedSet.add(s);
        }

        for (Map.Entry mapElement : frequencyMap.entrySet()) {
            String key = (String)mapElement.getKey();
            int value = (int)mapElement.getValue();
            if(!bannedSet.contains(key)){
                max = Math.max(max,value);
                if(max == value)
                    sol = key;
            }
        }

        return sol;
    }

    /*
    14.90%
     */
    /*
    public String mostCommonWord(String paragraph, String[] banned) {

        String[] splitedString = paragraph.split("\\P{Alpha}+");
        HashMap <String,Integer> hashWordCount = new HashMap<>();
        Set <String> setBannedWordCount = new HashSet<>();
        int maxFreq = 0;
        String sol = "";

        for(int i=0 ; i<banned.length ; i++){
            setBannedWordCount.add(banned[i]);
        }
       // System.out.println("setBannedWordCount: "+ setBannedWordCount);

        for(int i=0 ; i<splitedString.length ; i++){
            if(!setBannedWordCount.contains(splitedString[i]))
            hashWordCount.put(splitedString[i].toLowerCase(), hashWordCount.getOrDefault(splitedString[i].toLowerCase(),0) + 1);
        }
        //System.out.println("hashWordCount: "+ hashWordCount);

        return Collections.max(hashWordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
     */

    public static void main(String[] args) {
        String s = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        String solution = mostCommonWord(s,banned);
        System.out.println("Solution: "+ solution);
    }

}
