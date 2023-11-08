class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int countMax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                System.out.println(count);
            }
            if(nums[i]==0){
                if(count>countMax){
                    countMax=count;
                }
                count=0;
                System.out.println("hi");
            }
            if(count>countMax){
                    countMax=count;
                }
        }
        return countMax;
    }
}