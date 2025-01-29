class Solution {
    public boolean isHappy(int n) {
      HashSet<Integer> hs=new HashSet<>();
      while(!hs.contains(n)){
        hs.add(n);
        int sum =0;
        while(n!=0){
            int temp=n%10;
            sum+=temp*temp;
            n=n/10;
        }
        n=sum;
      }
     return n==1;
    }
}  