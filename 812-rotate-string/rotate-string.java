class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder gg = new StringBuilder(s);
        for(int i =0;i<s.length();i++){
            char ch = gg.charAt(0);
            gg.deleteCharAt(0);
            gg.append(ch);
            if(gg.toString().equals(goal))
                return true;
        }
        return false;
    }
}