class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> bag = new HashSet<>();
        // ArrayList<Integer>arr = new ArrayList<>();
        int  n = grid.length;
        int total = n*n; //total number of elements in a given nxn matrix
        int missing = -1;
        int repeated =-1;

        for(int i = 0 ; i<grid.length ; i++){
            for(int j =0  ; j<grid[0].length ; j++){
                if(bag.contains(grid[i][j])){
                    repeated = grid[i][j];
                }else{
                    bag.add(grid[i][j]);
                }
            }
        }
//nxn me first elemetn which is 1 se start krna h not 0 h(loop)
        for(int i =  1 ; i<=total ; i++){
            if(!bag.contains(i)){
                missing = i;
                break;
            }
        }
        return new int[]{repeated , missing};
    }
}