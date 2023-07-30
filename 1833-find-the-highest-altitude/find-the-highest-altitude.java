class Solution {
    public int largestAltitude(int[] gain) {

        int sum = 0;
        int ans = 0;

        for(int i =0 ; i<gain.length;i++){
            sum += gain[i];
            ans = Math.max(ans,sum);
        }
        return ans;
        

        // int[] arr = new int[gain.length+1];
        // arr[0]=0;
        // for(int i=1; i < arr.length ; i++){
        //     arr[i] = gain[i-1] + arr[i-1]; 
        // }
        // int max = arr[0]; 
        // for(int i =0; i < arr.length;i++){
        //     if(max<arr[i])
        //         max=arr[i]
        // }
        // return max;
    }
}