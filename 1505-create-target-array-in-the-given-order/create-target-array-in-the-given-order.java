class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arrList = new ArrayList<>(nums.length);
        int[] arry = new int[nums.length];
        for(int i =0 ; i< nums.length; i++){
            arrList.add(index[i],nums[i]);
        }
         for(int i=0; i<arrList.size();i++){
            arry[i]=arrList.get(i);
        }
        return arry;
    }
}