class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++) map.put(nums2[i],i);
        for(int i=0;i<nums1.length;i++){
            int index = map.get(nums1[i]);
            for(int j=index;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    arr[i]=nums2[j];
                    break;
                }
            }
            if(arr[i]==0) arr[i]=-1;
        }
        System.out.println(map);
        return arr;
    }
}