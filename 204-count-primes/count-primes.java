class Solution {
    public int countPrimes(int n) {
        boolean[] arr = new boolean[n];
        for(int i=2;i<=Math.sqrt(n);i++){
            if(arr[i]==false){
                for(int j = i*i; j<n;j+=i){
                    arr[j]=true;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(arr[i]==false)
                count++;
        }
        return count;
    }
}
//         int count =0;
//         if(n<=2)
//             return 0;
//         if(n<=3)
//             return 1;
//         for(int i=3;i<n;i+=2){
//             if(checkPrime(i)){
//                 count++;
//             }
//         }
//         return count+1;
//     }
//     static boolean checkPrime(int n){
//         int count=0;
//         for(int i=1; i<=Math.sqrt(n);i+=2){
//             if(n%i==0)
//                 count++;
//         }
//         if(count==1)
//             return true;
//         return false;
//     }
// }