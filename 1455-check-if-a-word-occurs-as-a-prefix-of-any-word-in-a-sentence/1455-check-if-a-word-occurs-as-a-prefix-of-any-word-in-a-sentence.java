class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int searchWordLen = searchWord.length();
        String words[] = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].length() < searchWordLen){
                continue;
            }
            if(searchWord.equals(words[i].substring(0 , searchWordLen))){
                return i+1;
            }
        }
        return -1;
    }
}