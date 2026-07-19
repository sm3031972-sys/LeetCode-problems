class Solution {
    public boolean isSubstringPresent(String s) {
        List<String> reverseList = new ArrayList<>();
        String revString = reverseStr(s);
        for(int i=0;i<revString.length() -1;i++){
            String revsubstr = revString.substring(i,i+2);
            reverseList.add(revsubstr);
        }
        for(int i=0;i<s.length()-1;i++){
            String substr = s.substring(i,i+2);
            if(reverseList.contains(substr)){
                return true;
            }
        }
        return false;
    }
    private static String reverseStr(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}