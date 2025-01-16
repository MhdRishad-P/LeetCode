class Solution {
    public int mySqrt(int x) {
        int Start=1;
        int End=x;
        int Result=0;
        while(Start<=End){
            int mid=Start+(End-Start)/2;
            if(mid<=x/mid){
                Start=mid+1;
                Result=mid;
            }
            else{
                End=mid-1;
            }
        }
        return Result;
    }
}