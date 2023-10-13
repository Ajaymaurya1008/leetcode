class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        HashSet<Integer> i = new HashSet<>();
        for(int a:nums1){
            h.add(a);
        }
        for(int b:nums2){
            if(h.contains(b)){
                i.add(b);
            }
        }
        int[] ans = new int[i.size()];
        int x = 0;
        for (int value : i) {
            ans[x] = value;
            x++;
        }
        return ans;
    }
}