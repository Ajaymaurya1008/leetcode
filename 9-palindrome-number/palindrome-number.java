class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        for(int i = 0; i < num.length()/2; i++){
            int start = num.charAt(i);
            int end = num.charAt(num.length()-i-1);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}