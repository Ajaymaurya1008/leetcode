class Solution {
    public boolean isSubsequence(String s, String t) {
        int m=0;
        for(int i=0;i<t.length();i++){
            if(m<s.length() && s.charAt(m)==t.charAt(i)){
                m++;
            }
        }
        if(m==s.length()) return true;
        return false;
    }
}