//643. Maximum Average Subarray I
public class maximumAverageSubarrayOne {
    class Solution {
    public double findMaxAverage(int[] nums, int k) {
        //Static sliding window algorithm
        double sum = 0;
        for(int i=0; i < k; i++){  //Calculate sum of first k elements
            sum+=nums[i];
        }
        
        double maxSum = sum;
        
        for(int i=k; i<nums.length; i++){
            sum-=nums[i-k];
            sum+=nums[i];
            maxSum = Math.max(sum,maxSum);
        }

        return maxSum / k;
    }
}
}
