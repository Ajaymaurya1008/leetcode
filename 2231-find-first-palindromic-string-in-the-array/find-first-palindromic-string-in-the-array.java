class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(isPalindrome(s)){
                return s;
            }
        }
        return "";
    }
    public boolean isPalindrome(String s){
        int end = s.length()-1;
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(end)){
                return false;
            }
            end--;
        }
        return true;
    }
}