class Solution {
    public boolean canJump(int[] nums) {
        // boolean m = true;
        // for(int i =0; i<nums.length; i+=nums[i]){
        //     if(i==nums.length-1){
        //         m=true;
        //     }
        //     else{
        //         m = false;
        //     }
        // }
        // int i =0;
        // while(i<nums.length){
        //     if(i==nums.length-1){
        //         m=true;
        //     }
        //     else{
        //         m = false;
        //     }
        //     i+=nums[i];
        // }
        // return m;

       int reachable = 0;
       for(int i = 0; i < nums.length; i ++) {
           if(i > reachable) return false;
           reachable = Math.max(reachable, i + nums[i]);
       } 
       return true;

    }
}


        // boolean m = true;
        // boolean p = true;
        // if (nums.length == 1){
        //     p = true;
        // }
        // else if (nums.length == 2){
        //     p = true;
        // }
        // else{
        //     int n = nums[1];
        //     for(int i = 0; i < n + 2 ; i++){
        //         if(i==nums.length-1){
        //             p=true;
        //         }
        //         else{
        //             p=false;
        //         }
        //     }
        // }
        