class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] Char_Count=new int[26];
        for(int i=0;i<text.length();i++){
            Char_Count[text.charAt(i)-'a']++;
        }
        int min=Char_Count[1];
        min=Math.min(min,Char_Count[0]);
        min=Math.min(min,Char_Count[11]/2);
        min=Math.min(min,Char_Count[14]/2);
        min=Math.min(min,Char_Count[13]);
        return min;
        
    }
}