
class Solution {
    public int search(int[] nums, int target) {
        int n = findPivot(nums);        
        int start=0;
        int end = n-1;
        System.out.println(n);
        System.out.println(end);
        if(target==nums[n])
            return n;
        while(start<=end){
            int mid = start + (end-start)/2;
            System.out.println(mid);
            if(nums[mid]<target)
                start=mid+1;
            else if(nums[mid]>target)
                end=mid-1;
            else if(target==nums[mid])
                return mid;
            }
        int start2=n+1;
        int end2 = nums.length-1;
        while(start2<=end2){
            int mid = start2 + (end2-start2)/2;
            if(nums[mid]<target)
                start2=mid+1;
            else if(nums[mid]>target)
                end2=mid-1;
            else if(target==nums[mid])
                return mid;
            }
        return -1;
        }
        
    
    
    public int findPivot(int[] arr){
        int start  =0;
        int end = arr.length-1;
        int mid=0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            else if(mid>start && arr[mid]<arr[mid-1])
                return mid-1;
            else if(arr[mid]<=arr[start])
                end=mid-1;
            else
                start=mid+1;
        }
        return mid;
    }
    
}