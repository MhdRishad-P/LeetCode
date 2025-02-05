class Solution {
    public boolean check(int[] nums) {
        int length=nums.length;
        int Deviations=0;
        for(int i=0;i<length;i++){
            if(i<length-1 && nums[i]>nums[i+1]){
                Deviations++;
            }else if(i ==length-1 && nums[length-1] >nums[0]){
                Deviations++;
            }
        }
        return(Deviations >1) ? false:true;
    }
}