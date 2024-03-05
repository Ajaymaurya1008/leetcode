class Solution {
    public int minimumLength(String s) {
        int a = 0;
        int b = s.length() - 1;
        while (a < b && s.charAt(a) == s.charAt(b)) {
            char currentChar = s.charAt(a);
            while (a <= b && s.charAt(a) == currentChar) {
                a++;
            }
            while (a <= b && s.charAt(b) == currentChar) {
                b--;
            }
        }
        return b - a + 1;
    }
}