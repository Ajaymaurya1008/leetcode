class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            int m = Arrays.binarySearch(nums2,nums1[i]);
            if(m>-1){
                list.add(nums1[i]);
            }
            // for(int j=0;j<nums2.length;j++){
            //     if(nums1[i]==nums2[j]){
            //         // int k = Collections.binarySearch(list,nums1[i]);
            //         // System.out.println(k);
            //         // if(k<0){
            //         list.add(nums1[i]);
            //     }
            // }
        }
        Set<Integer> hashSet = new LinkedHashSet(list);
        ArrayList<Integer> list2 = new ArrayList(hashSet);
        int[] arr = new int[list2.size()];
        for(int i =0;i<list2.size();i++){
            arr[i]=list2.get(i);
        }
        return arr;
    }
}