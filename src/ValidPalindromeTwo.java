public class ValidPalindromeTwo {
    public static boolean validPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while(start < end ){
            if( s.charAt(start) != s.charAt(end)  ){
                return checkPalindrome(s,start+1,end) || checkPalindrome(s,start,end - 1);
            }
            start++;
            end--;
        }
        return true;

    }

    public static boolean checkPalindrome(String s, int start, int end){

        while(start < end ){
            if( s.charAt(start) != s.charAt(end) ){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";

        boolean solution = validPalindrome(s);
        System.out.println("Solution: "+ solution);
    }
}
