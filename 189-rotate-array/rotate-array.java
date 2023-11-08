class Solution {
    public void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[(i+k)%nums.length] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int[] arr = new int[k];
//         if(nums.length<k){
//             return;
//         }
//         int l=0;
//         if(nums.length>1){
//         l = nums.length-1;
//         }
//         for(int i =0;i<k;i++){
//             arr[i]=nums[l];
//                 l--;
//         }
//         int[] num = new int [nums.length];
//         for(int i =0;i<num.length;i++){
//             num[i]=nums[i];
//         }
//         int m=0;
//         for(int i=k;i<nums.length;i++){
//             nums[i]=num[m];
//             m++;
//         }
//         int n = arr.length-1;
//         for(int i=0;i<k;i++){
//             nums[i]=arr[n];
//             n--;
//         }
//     }
// }