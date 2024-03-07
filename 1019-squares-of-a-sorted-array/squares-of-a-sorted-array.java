class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int m=0;
        for(int i:nums){
            arr[m]=i*i;
            m++;
        }
        Arrays.sort(arr);
        return arr;
    }
}