class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map  =new HashMap<>();
        if(nums.length<2 || k==0 || nums==null){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}