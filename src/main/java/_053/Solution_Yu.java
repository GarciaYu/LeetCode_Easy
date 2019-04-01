package _053;

public class Solution_Yu {
    /*
    Approach
    Time Complexity: 4.5%
    Space Complexity: 1.1%
     */
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
