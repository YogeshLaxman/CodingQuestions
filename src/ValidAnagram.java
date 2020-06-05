public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {

        int[] charCountArray = new int['z' - 'a' + 1];

        for(char c: s.toCharArray()){
            charCountArray[c - 'a']++;
        }

        for(char c: t.toCharArray()){
            charCountArray[c - 'a']--;
        }

        for(int i: charCountArray){
            if(i !=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "hello";
        String t = "elloh";

        boolean solution = isAnagram(s,t);
        System.out.println("Solution: "+ solution);
    }
}
