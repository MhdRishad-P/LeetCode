class Solution {
    public int singleNumber(int[] nums) {
        int Value=0;
        for(int i=0;i<nums.length;i++){
            Value=Value^nums[i];
        }
     return Value;   
    }
}