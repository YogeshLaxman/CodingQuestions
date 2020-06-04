import java.util.Arrays;

public class KClosestPointsToOrigin {

    public static int[][] kClosest(int[][] points, int K) {
        //find what the max distance from origin should be
        //A: sort the distances
        int[] sortedDistance = new int[points.length];
        for(int i =0 ; i < points.length ; i++){
            sortedDistance[i] = distance(points[i]);
        }

        Arrays.sort(sortedDistance);
        int maxDistance = sortedDistance[K-1];

        int[][] ans = new int[K][2];
        int found = 0; int index = 0;
        while(found < K && index< points.length){
            if(distance(points[index]) <= maxDistance){
                ans[found] = points[index];
                found++;
            }
            index++;
        }

        return ans;
    }

    private static int distance(int[] point) {
        return (point[0]*point[0]) + (point[1]*point[1]);
    }

    public static void main(String[] args) {
        int[][] nums = new int[][] {{1,3},{-2,2}};
        int target = 1;
        int[][] solution = kClosest (nums,target);
        for (int i = 0; i < solution.length; i++) {
            System.out.println("Solution "+ i+1 +": "+ solution[i][0] + ","+ solution[i][1]);
        }

    }
}
