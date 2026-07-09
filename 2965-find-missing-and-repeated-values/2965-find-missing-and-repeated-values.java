class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int a = 0,b=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        for(int i=1;i<= n*n;i++){
            if(!set.contains(i)){
                b = i;
                break;
            }
        }
        return new int[] {a,b};
    }
}