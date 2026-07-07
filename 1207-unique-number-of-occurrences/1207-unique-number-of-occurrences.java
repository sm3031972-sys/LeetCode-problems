class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length == 0){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }
        Set<Integer> set = new HashSet<>(map.values());

        if(map.size() == set.size()){
            return true;
        }
        return false;
    }
}