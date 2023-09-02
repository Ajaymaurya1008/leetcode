class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int [] ans = new int[2];
        int total1 =0;
        int total2 =0;
        for(int i =0; i<aliceSizes.length;i++){
            total1 += aliceSizes[i];
        }
        for(int i =0; i<bobSizes.length;i++){
            total2 += bobSizes[i];
        }
        int total = total1 + total2;
        for(int i =0; i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                // int temp = aliceSizes[i];
                // aliceSizes[i] = bobSizes[j];
                // bobSizes[j] = temp;
                if(total1-aliceSizes[i]+bobSizes[j]==total/2){
                    ans[0]=aliceSizes[i];
                    ans[1]=bobSizes[j];
                }
            }
        }
        return ans;
    }
}