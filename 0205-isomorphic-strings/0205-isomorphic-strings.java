class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] Sarr=new char[256];
        char[] Tarr=new char[256];
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(Sarr[sChar]==0 && Tarr[tChar]==0){
                Sarr[sChar]=tChar;
                Tarr[tChar]=sChar;
            }else if(Sarr[sChar] != tChar){
                return false;
            }
        }
        return true;
    }
}