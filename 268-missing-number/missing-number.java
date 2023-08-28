class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<=nums.length;i++){
            int n = Arrays.binarySearch(nums,i);
            if(n<0)
                return i;
        }
        return -1;
    }
}