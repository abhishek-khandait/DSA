class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hm= new HashMap<Integer , Integer>();
        for(int i =0 ; i<nums.length ; i++){
            int required_no = target-nums[i];
            if(hm.containsKey(required_no)){
                int arr [] = {hm.get(required_no) , i};
                return arr;
            }
            else{
                hm.put(nums[i] , i);
            }
        } 
        return null;
        
    }

    public static void main(String args[]){
        int []arr = {2,3,4};
        System.out.println(Arrays.toString(twoSum(arr , 6)));
    }
}