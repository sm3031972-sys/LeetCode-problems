class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      Set<Character> set = new HashSet<>();
      for(char ch : allowed.toCharArray()){
        set.add(ch);
      } 
      int count = 0;
      for(String word : words){
        boolean isConsistant = true;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!set.contains(ch)){
                isConsistant = false;
                break;
            }
        }
        if(isConsistant){
            count++;
        }
      }
      return count;
    }
}