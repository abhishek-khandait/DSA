class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int duplicate = 0;
        for(int i  = 1 ; i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                duplicate = nums[i];
                return duplicate;
            }
        }

        return -1; //if no duplicte;
       
    }
}