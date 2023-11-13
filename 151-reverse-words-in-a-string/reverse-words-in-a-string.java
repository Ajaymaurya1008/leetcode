class Solution {
    public String reverseWords(String s) {
        StringBuilder ss = new StringBuilder();
        String newStr = s.trim();
        String[] ans = newStr.trim().split("\\s+");
        reverseArray(ans);
        System.out.println(Arrays.toString(ans));
        for(String i:ans){
            ss.append(i).append(" ");
        }
        ss.trimToSize();
        return ss.toString().trim();
    }
    public void reverseArray(String[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}