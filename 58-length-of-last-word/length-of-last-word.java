class Solution {
    public int lengthOfLastWord(String s) {
        String[] b = s.split(" ");
        return b[b.length-1].length();
    }
}