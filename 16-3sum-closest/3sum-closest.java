class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int almost = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<Math.abs(almost-target)) almost=sum;
                if(sum<target){
                    j++;
                }else if(sum>target){
                    k--;
                }else{
                    return sum;
                }
            }
        }
        return almost;
    }
}
        // Arrays.sort(nums);
        // int n=0;
        // int[] arr = new int[nums.length-2];
        // int start=0;
        // for(int i=2;i<nums.length;i++){
        //     arr[start]=nums[i]+nums[i-1]+nums[i-2];
        //     start++;
        // }
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(nums));
        // System.out.println(Arrays.toString(arr));
        // return BinarySearch(arr,target)

//     static int BinarySearch(int[] arr,int t){
//         int start=2;
//         int end = arr.length-1;
//         while(start<end){
//             int mid = start + (end-start)/2;
//             if(arr[mid]<t){
//                 start =mid+1;
//             }else if(arr[mid]>t){
//                 end = mid;
//             }else{
//                 return arr[mid];
//             }
//         }
//         return arr[end];
//     }
// }