class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i=0;i<n;i++){
            arr[2*i] = nums[i];
            arr[2*i + 1] = nums[i+n];
        }
        // for(int i=0,j = n-1; i< nums.length && j< nums.length; i++,j++){
        //     if(i%2==0){
        //         arr[i]=nums[i];
        //     }
        //     else{
        //         arr[i]=nums[j];
        //     }
        //     // if(i%2==0){
        //     //     for(int j = 0; j<i+1 ; j++){
        //     //         arr[i]=nums[j];
        //     //     }
        //     // }
        //     // else{
        //     //     for(int k = n; k < nums.length; k++){
        //     //         arr[i] = nums[k];
        //     //     }
        //     // }
        // }
        return arr;   
    }
}