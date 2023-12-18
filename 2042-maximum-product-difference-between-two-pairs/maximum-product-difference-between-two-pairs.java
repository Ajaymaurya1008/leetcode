class Solution {
    public int maxProductDifference(int[] nums) {
        int max=0;
        int min=Integer.MAX_VALUE; 
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int prod=nums[i]*nums[j];
                if(prod>max){
                    max=prod; 
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int prod=nums[i]*nums[j];
                if(prod<min){
                    min=prod; 
                }
            }
        }
        return max-min;
    }
}