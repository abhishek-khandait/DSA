class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>result = new HashSet<>();
        for(int i = 0 ; i<nums.length ; i++){
            Set<Integer>seen = new HashSet<>(); //har iteration ke kiye hashset empty hona chaiye
            for(int j = i+1 ; j<nums.length;j++){
                int num = -(nums[i] + nums[j]);
                if(seen.contains(num)){
                    List<Integer>trigger = Arrays.asList(num , nums[i] , nums[j]);
                    Collections.sort(trigger);
                    result.add(trigger);
                }
                seen.add(nums[j]);

            }


        }
        return new ArrayList<>(result);
        



        
    }
}

