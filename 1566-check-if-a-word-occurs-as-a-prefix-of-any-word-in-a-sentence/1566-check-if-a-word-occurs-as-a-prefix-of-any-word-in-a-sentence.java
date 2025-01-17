class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] ArrSentences=sentence.split(" ");
        for(int i=0;i<ArrSentences.length;i++){
            if(ArrSentences[i].startsWith(searchWord)){
                return i+1;
            }
        }
     return -1;   
    }
}