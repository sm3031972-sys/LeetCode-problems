class Solution {
    public int[] findErrorNums(int[] nums) {
        int result[] = new int[2];
        int duplicate = 0,missing = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num) + 1);
            }
            else{
                map.put(num , 1);
            }
        }
        for(int i=0;i<=nums.length;i++){
            if(map.containsKey(i)){
                if(map.get(i) == 2){
                    duplicate = i;
                }
            }
            else{
                missing = i;
            }
        }
        result[0] = duplicate;
        result[1] = missing;
        return result;
    }
}