import java.util.HashMap;

public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> preSum = new HashMap<>();
        int totalSubArrays = 0;
        preSum.put(0,1);
        int currentSum = 0;

        for(int i = 0 ; i < nums.length ; i++){
            currentSum += nums[i];
            if(preSum.containsKey(currentSum - k)){
                totalSubArrays += preSum.get(currentSum - k);
            }
            preSum.put(currentSum, preSum.getOrDefault(currentSum,0) + 1);
        }
        return totalSubArrays;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,1};
        int target = 2;
        int solution = subarraySum(nums,target);
        System.out.println("Solution: "+ solution);
    }

}
