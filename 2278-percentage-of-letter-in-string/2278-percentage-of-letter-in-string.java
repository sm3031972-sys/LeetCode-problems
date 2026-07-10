class Solution {
    public int percentageLetter(String s, char letter) {
        char chars[] = s.toCharArray();
        int count = 0;
        for(int i=0;i<chars.length;i++){
            if(chars[i] == letter){
                count++;
            }
        }
        int len = s.length();
        int percentage = (int)((count*100)/len);
        return percentage;
    }
}