public class SquarerootUsingDivideAndConquer {

    public static int mySqrt(int x) {
        if(x <= 1) return x;
        int lo = 1;
        int hi = x/2;
        int mid = -1;
        int prevMid = 0;
        while(lo <= hi){
            // System.out.println("Mid: "+ mid);
            prevMid = mid;
            mid = lo + (hi - lo)/2;

            if(x/mid == mid){
                return mid;
            }
            else if(x/mid > mid){
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }


        }
        return lo -1;
    }

    public static void main(String[] args) {
        int x = 15;
        System.out.println(mySqrt(x));
    }
}
