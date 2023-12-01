public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length() - 1; i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);

            if (odd.length() > maxStr.length()) {
                maxStr = odd;
            }
            if (even.length() > maxStr.length()) {
                maxStr = even;
            }
        }

        return maxStr;
    }

    private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}

// class Solution {
//     public String longestPalindrome(String s) {
//         if(s.length()<=1) return s;
//         if(checkPal(s)) return s;
//         String ans = "";
//         for(int i =0;i<s.length();i++){
//             for(int j = i+1;j<s.length()+1;j++){
//                 String mm = s.substring(i,j);
//                 System.out.println(mm);
//                 if(checkPal(mm)){
//                     if(ans.length()<mm.length()){
//                         ans = mm;
//                     }
//                 }
//                 System.out.println(ans);
//             }
//         }
//         return ans;
//     }

//         static boolean checkPal(String s){
//             String ans = new StringBuilder(s).reverse().toString();
//             if(s.equals(ans)){
//                 return true;
//             }
//             return false;
//         }
// }