class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n==1){
            arr[0] = 0;
            return arr;
        }
        int temp=0;
        if(n%2==0){
                temp=n;
            }
        if(n%2!=0){
                temp = n-1;
                arr[n-1]=0;
            }
        for(int i = 0; i <temp ; i+=2){
            arr[i]=i+1;
            arr[i+1]=-(i+1);
            
        }
        return arr;
     }
}
