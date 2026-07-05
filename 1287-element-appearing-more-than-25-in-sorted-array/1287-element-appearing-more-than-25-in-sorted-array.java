class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int target = arr.length / 4;
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num , map.get(num) + 1);
            }
            else{
                map.put(num , 1);
            }
            if(map.get(num) > target){
                return num;
            }
        }
        return -1;
    }
}