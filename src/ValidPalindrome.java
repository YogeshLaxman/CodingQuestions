public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] charArray = new char[s.length()];
        charArray = s.toLowerCase().toCharArray();
        while(start < end ){
            if(!isLetterOrDigit(charArray[start])) start++;
            else if (!isLetterOrDigit(charArray[end])) end--;
            else{
                if( charArray[start] != charArray[end]) return false;
                start++;
                end--;
            }
        }
        return true;
    }

    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= '0' && c <= '9');
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        boolean solution = isPalindrome(s);
        System.out.println("Solution: "+ solution);
    }
}
