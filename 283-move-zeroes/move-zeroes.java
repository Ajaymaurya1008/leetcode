class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list =  new ArrayList<>();
        for(int i:nums){
            if(i!=0){
                list.add(i);
            }
        }
        int rem = nums.length-list.size();
        for(int i =0;i<rem;i++){
            list.add(0);
        }
        for(int i =0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
    }
}