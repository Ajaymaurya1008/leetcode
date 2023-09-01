class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            // int bin = Integer.parseInt(Integer.toBinaryString(i));
            // System.out.println(bin);
            arr[i] = Integer.bitCount(i);
        }
        return arr;
    }

    // static int countOne(int n){
    //     int count = 0;
    //     while (n > 0) {
    //         count += n & 1;
    //         n >>= 1;
    //     }
    //     return count;
    // }

}