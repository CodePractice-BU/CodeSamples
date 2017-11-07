package ProblemOneToFifty;

import java.util.HashMap;
import java.util.Map;

public class Num1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] rst = new int[2];
        Map<Integer, Integer> numMap = new HashMap<>();
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        for (int i = 0; i < nums.length; i++){
            if (numMap.containsKey(target - nums[i])) {
                rst[0] = numMap.get(target - nums[i]);
                rst[1] = i;
                return rst;
            }
            numMap.put(nums[i], i);
        }
        return rst;
    }
    public static void main(String[] args) {
        int[] input = new int[]{2, 7, 11, 15};
        Num1TwoSum solution = new Num1TwoSum();
        int[] rst = solution.twoSum(input, 18);
        System.out.println("Start");
        System.out.println(rst[0] + " " + rst[1]);
        System.out.println("End");
    }
}
