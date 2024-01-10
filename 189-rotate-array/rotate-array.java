class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length) k=k%nums.length;
        int n=nums.length-1;
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);
     }
    public void reverse(int[] arr,int m,int n){
        while(m<n){
            int temp=arr[m];
            arr[m]=arr[n];
            arr[n]=temp;
            m++;n--;
        }

    }
}
