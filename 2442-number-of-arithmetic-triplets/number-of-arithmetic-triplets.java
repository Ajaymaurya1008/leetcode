class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet();
        for(int i:nums) set.add(i);
        int c=0;
        for(int i:nums){
            if(set.contains(i-diff) && set.contains(i+diff)){
                c++;
            }
        }
        return c;
    }
}