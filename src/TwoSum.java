import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i = 0 ; i<nums.length ; i++){
            if(hm.containsKey(target - nums[i])){
                return new int[] {hm.get(target - nums[i]), i};
            }
            else{
                hm.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] solution = twoSum(nums,target);
        System.out.println("Solution: "+ solution[0] + " " + solution[1]);
    }
}
