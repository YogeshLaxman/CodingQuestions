import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int result = 0;

        for(int i = 0 ; i<s.length() ; i++){
            if( i> 0 && hm.get(s.charAt(i - 1)) < hm.get(s.charAt(i))){
                result -= 2*hm.get(s.charAt(i - 1));
            }

            result += hm.get(s.charAt(i));

        }

        return result;
    }

    public static void main(String[] args) {
        String s = "III";

        int solution = romanToInt(s);
        System.out.println("Solution: "+ solution);
    }


}
