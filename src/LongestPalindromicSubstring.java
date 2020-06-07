public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        int max = 0;
        String sol = "";
        for(int i=0 ; i<s.length() ; i++){
            int[] one = checkPalindrome(s,i,i);
            int[] two = checkPalindrome(s,i,i+1);

            int[] tempMax = new int[3];

            if(one[0]>two[0]){
                tempMax = one;
            }else{
                tempMax = two;
            }

            if(tempMax[0]>max){
                max= tempMax[0];
                sol = s.substring(tempMax[1],tempMax[2] + 1);
            }
        }

        return sol;
    }

    public static int[] checkPalindrome(String s, int start, int end){
        while( start >= 0 && end < s.length()){
            if( s.charAt(start) != s.charAt(end) ){
                start++;
                end--;
                return new int[] {(end-start)+1, start, end};
            }
            start--;
            end++;
        }
        start++;
        end--;
        return new int[] {(end-start)+1, start, end};
    }

    public static void main(String[] args) {
        String s = "babad";

        String solution = longestPalindrome(s);
        System.out.println("Solution: "+ solution);
    }
}
