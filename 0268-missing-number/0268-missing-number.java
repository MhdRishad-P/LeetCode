class Solution {
    public int missingNumber(int[] nums) {
        int Sum=0;
        for(int i=0;i<nums.length;i++){
            Sum=Sum+nums[i];
        }
        int ActualSum=(nums.length*(nums.length+1))/2;
        int MissingNum=ActualSum-Sum;
        return MissingNum;
        
    }
}