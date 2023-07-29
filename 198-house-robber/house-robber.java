class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        int a = nums[0];
        int b = nums[1];
        int temp = 0;

        for(int i =2; i<nums.length; i++){
            b = Math.max(a,b);
            if(a + nums[i] >= b)
                a += nums[i];
            temp = a;
            a = b;
            b = temp;
        }
        return Math.max(a,b);

        // int even=0;
        // int odd=0;
        // int max=0;
        // int m=0;
        // for(int i =0;i<nums.length;i++){
        //     if(i%2==0){
        //         even += nums[i];
        //     }
        //     else{
        //         odd += nums[i];
        //     }
        //     // even += nums[2*i];
        //     // odd += nums[2*i+1];
        // }
        // if(nums.length>2){
        //     max=nums[0]+nums[nums.length-1];
        // }
        // if(even>odd){
        //     m=even;
        // }
        // if(odd>even){
        //     m = odd;
        // }
        // if(odd==even){
        //     m = even;
        // }
        // if(max>m){
        //     m=max;
        // }
        // return m;
        
    }
}