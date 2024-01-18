class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int a=0;
        int b=0;
        int sum=0;
        int avg=0;
        int count=0;
        while(b<arr.length){
            sum+=arr[b];
            if(b-a+1<k){
                b++;
            }else if(b-a+1==k){
                if(sum/k>=threshold) count++;
                sum-=arr[a];
                a++;b++;
            }
        }
        return count;
    }
}