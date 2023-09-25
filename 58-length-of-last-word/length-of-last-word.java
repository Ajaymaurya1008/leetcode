class Solution {
    public int lengthOfLastWord(String s) {
        String[] b = s.split(" ");
        String last = b[b.length-1];
        return last.length();
    }
}