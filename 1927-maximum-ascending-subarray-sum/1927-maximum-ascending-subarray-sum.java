class Solution {
    public int maxAscendingSum(int[] nums) {
        int Sum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                Sum+=nums[i];
            }else{
                Sum=nums[i];
            }
            maxSum=Math.max(maxSum,Sum);
        }
       return maxSum; 
    }
}