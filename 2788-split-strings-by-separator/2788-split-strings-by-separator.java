class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String wordArray[] = words.get(i).split("["+separator+"]");
            for(String word : wordArray){
                if(word != ""){
                    result.add(word);
                }
            }
        }
        return result;
    }
}