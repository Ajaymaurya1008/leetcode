class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i:nums1) set1.add(i);
        for(int i:nums2) set2.add(i);
        for(int i:nums1){
            if(!set2.contains(i) && !list2.contains(i)){
                list2.add(i);
            }
        }
        for(int i:nums2){
            if(!set1.contains(i)  && !list1.contains(i)){
                list1.add(i);
            }
        }
        list.add(list2);
        list.add(list1);
        return list;
    }
}