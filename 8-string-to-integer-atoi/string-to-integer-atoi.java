class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        
        int multiplier = 1;
        int index = 0;
        char firstChar = s.charAt(0);

        if (firstChar == '-' || firstChar == '+') {
            if (firstChar == '-') {
                multiplier = -1;
            }
            index++;
        }

        int num = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            
            // Checking for overflow and underflow
            if (multiplier == 1 && (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && digit >= 7))) {
                return Integer.MAX_VALUE;
            }
            if (multiplier == -1 && (num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE/10 && digit >= 8))) {
                return Integer.MIN_VALUE;
            }
            
            num = num * 10 + digit * multiplier;
            index++;
        }
        
        return num;
    }
}

// class Solution {
//     public int myAtoi(String s) {
//         s = s.trim();
//         System.out.println(s);
//         StringBuilder bb = new StringBuilder("");
//         for(int i=0;i<s.length();i++){
//             // char value = s.charAt(i);
            
//             if(Character.isDigit(s.charAt(i)) || s.charAt(i)=='-' ){
//                 bb.append(s.charAt(i));
//             }
//             if(Character.isWhitespace((s.charAt(i)))){
//                 break;
//             }
//         }
//         if(bb.length()==0){
//             bb.append(0);
//         }
//         String gg = bb.toString();
//         System.out.println(gg);
//         // int minValue = (int) -Math.pow(2, 31); // Minimum 32-bit signed integer value
//         // int maxValue = (int) (Math.pow(2, 31) - 1); // Maximum 32-bit signed integer value
//         // int valueToClamp = ans; // Replace with the value you want to clamp

//         // if (valueToClamp < minValue) {
//         //     valueToClamp = minValue;
//         // } else if (valueToClamp > maxValue) {
//         //     valueToClamp = maxValue;
//         // }
//         int ans = Integer.parseInt(gg);
//         return ans;
//     }
// }