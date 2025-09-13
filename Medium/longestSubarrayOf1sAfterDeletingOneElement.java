public class longestSubarrayOf1sAfterDeletingOneElement {
        public int longestSubarray(int[] nums) {
        int len = nums.length;
        int front = 0, rear = 0;
        int zerocount = 0;
        int result = 0;
        while(front < len && rear < len){
            if(nums[front] == 0){
                zerocount++;
                while(zerocount > 1){
                    if(nums[rear]==0){
                        zerocount--;
                        rear++;
                    }else{
                        rear++;
                    }
                }
            }
            result = Math.max(result,front-rear);
            front++;
        }
        
        return result;
            
    }
}
