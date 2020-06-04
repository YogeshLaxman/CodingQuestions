import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> preSumMap = new HashMap<>();
        preSumMap.put(0,-1);
        int currentpreSum = 0;
        for(int i= 0 ; i <nums.length ; i++){
            currentpreSum += nums[i];

            if(k !=0 ){
                currentpreSum = currentpreSum % k;
            }
            if(preSumMap.containsKey(currentpreSum)){
                if( i - preSumMap.get(currentpreSum) > 1) return true;
            }

            preSumMap.putIfAbsent(currentpreSum,i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1};
        int target = 2;
        boolean solution = checkSubarraySum (nums,target);
        System.out.println("Solution: "+ solution);
    }
}
