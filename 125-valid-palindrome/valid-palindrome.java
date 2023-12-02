class Solution {
    public boolean isPalindrome(String s) {
        String ans =  s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev = new StringBuilder(ans).reverse().toString().toLowerCase();
        if(ans.equals(rev)) return true;
        return false;
    }
}