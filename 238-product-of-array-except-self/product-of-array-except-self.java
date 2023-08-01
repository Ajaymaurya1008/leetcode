class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int cal =1;
        int cal2 = 1;
        for(int i=0; i<nums.length;i++){
            cal *= nums[i];
            arr[i]=cal;
        }
        cal = 1;
        for(int i = nums.length-1;i>0;i--){
            arr[i] = arr[i-1]*cal;
            cal *= nums[i];
        }
        arr[0]=cal;

            // if(nums[i]==0){
            //     cal = cal * 1;
            // }
            // else{
            //     cal = cal * nums[i];
            // }
            // cal2 = cal2 * nums[i];
            // if(nums[i]==0){
            //     nums[i]=0;
            // }
            // else{
            //     cal = cal*nums[i];
            // }
        // for(int i=0; i<nums.length;i++){
        //     if(nums[i]==0 && nums[nums.length-1] ==0){
        //         arr[i]=arr[nums.length-1]=0;
        //     }
        //     else if(nums[i] == 0){
        //         arr[i] = cal;
        //     }
        //     else{
        //         arr[i]=cal2/nums[i];
        //     }
        // }
        return arr;
    }
}