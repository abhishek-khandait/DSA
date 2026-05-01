class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        int left = 0;
        Set<Character>result = new HashSet<>();
        for(int right = 0 ; right<s.length() ; right++){
            while(result.contains(s.charAt(right))){
                result.remove(s.charAt(left));
                left++;
            }
            result.add(s.charAt(right));
            maxlength= Math.max(maxlength , right- left+1); //indexing 0 se h isliye +1
        }
        return maxlength;
        
    }
}