class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        HashSet<Integer> i = new HashSet<>();
        for(int a:nums1){
            h.add(a);
        }
        for(int b:nums2){
            i.add(b);
        }
        for(int m:h){
            if(i.contains(m)){
                list.add(m);
            }
        }
        int[] arr =list.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}