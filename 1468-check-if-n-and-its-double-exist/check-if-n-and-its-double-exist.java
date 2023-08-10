class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==2*arr[j] || arr[j]==2*arr[i])
                    return true;
            }
        }
        return false;
    }
}







        // Arrays.sort(arr);
        // int m =-1;
        // for(int i=0;i<arr.length;i++){
        //     m = Arrays.binarySearch(arr,arr[i]*arr[i]);
        //     if(m>0)
        //         return true;
        // }
        // return false;

           // start = i + 1;
            // end = arr.length - i;
            // while(start<=end){
            //     mid = start + (end-start)/2;
            //     if(arr[mid]>arr[i]*2)
            //         end = mid -1;
            //     else if(arr[mid]<arr[i]*2)
            //         start = mid + 1;
            //     else{
            //         return true;
            //     }
            // }
    