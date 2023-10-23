class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int quotient = 0;
        boolean negative = (dividend < 0) != (divisor < 0);
        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);
        while (longDividend >= longDivisor) {
            int shift = 0;
            while (longDividend >= (longDivisor << shift)) {
                shift++;
            }
            shift--;
            longDividend -= longDivisor << shift;
            quotient += 1 << shift;
        }
        return negative ? -quotient : quotient;
    }
}

// class Solution {
//     public int divide(int dividend, int divisor) {
//         int count = 0;
//         int a = Math.abs(dividend);
//         if(dividend == Integer.MIN_VALUE){
//             a = -Integer.MIN_VALUE-1;
//         }
//         if (dividend == Integer.MIN_VALUE && divisor == -1) {
//             return Integer.MAX_VALUE;
//         }
//         if (dividend == Integer.MIN_VALUE && divisor == 2) {
//             return -Integer.MAX_VALUE/2-1;
//         }
//         if(dividend == Integer.MIN_VALUE && divisor == 1) {
//             return Integer.MAX_VALUE+1;
//         }
//         int b = Math.abs(divisor);
//         if(divisor == Integer.MIN_VALUE){
//             b = -Integer.MIN_VALUE-1;
//         }
//         if(divisor == Integer.MIN_VALUE && dividend==Integer.MAX_VALUE){
//             return 0;
//         }
//         // System.out.println(b);
//         while(a>=0){
//             a-=b;
//             if(a>=0){
//                 count++;
//             }
//         }
//         if(dividend<0 && divisor<0){
//             count = count;
//         }else if(dividend<0 || divisor<0){
//             count = -count;
//         }
//         return count;
//     }
// }