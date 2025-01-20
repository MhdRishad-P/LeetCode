class Solution {
    public int reverse(int x) {
     int Rev=0;
     while(x!=0){
        int LastDigit =x%10;
        if(Rev>Integer.MAX_VALUE/10||Rev<Integer.MIN_VALUE/10){
            return 0;
        }
        
        Rev=Rev*10+LastDigit;
        x=x/10;


     }

       return Rev; 
    }
}