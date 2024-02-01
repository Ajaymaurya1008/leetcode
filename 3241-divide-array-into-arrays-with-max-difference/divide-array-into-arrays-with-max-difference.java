class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] arr = new int[nums.length/3][3];
        int[][] arr2 = new int[0][0];
        int m=0;
        int n=0;
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            arr[m][n] = nums[i];
            if(n==2){
                n=0;m++;
            }else{
                n++;
            }
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i][1]-arr[i][0]>k) return arr2;
            if(arr[i][2]-arr[i][1]>k) return arr2;
            if(arr[i][2]-arr[i][0]>k) return arr2;
        }
        return arr;
    }
}