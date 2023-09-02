class Solution {
    public int addDigits(int num) {
        while(num>9){
            num = num%10 + num/10;
        }
        return num;
    }

    // static int digitCount(int n){
    //     int count =0;
    //     while (n > 0) {
    //         int d = n % 10;
    //         n = n/10;
    //         count++;
    //     }
    //     return count;
    // }
}