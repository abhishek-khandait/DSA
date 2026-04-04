class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int a = 0;
        int b = s.length() - 1;
        while(a<b){
            if(s.charAt(a) != s.charAt(b)){
                return false;

            }else{
                a++;
                b--;
            }

        }return true;
    }
}