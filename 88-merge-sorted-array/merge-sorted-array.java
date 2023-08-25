class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int  i=m,j=0;j<n;j++){
            if(i<nums1.length){
            nums1[i]=nums2[j];
            i++;
            }
        }
        Arrays.sort(nums1);
    }
}