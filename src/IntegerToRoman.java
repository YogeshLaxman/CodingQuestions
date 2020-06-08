public class IntegerToRoman {

    public static String intToRoman(int num) {
        String[] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousands = {"","M","MM","MMM"};

        return thousands[num/1000] + hundreds[(num%1000)/100] + tens[(num%100)/10] + units[num%10];

    }
    public static void main(String[] args) {
        int s = 1234;

        String solution = intToRoman(s);
        System.out.println("Solution: "+ solution);
    }
}
