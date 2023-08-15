class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int start = 0;
        int c = matrix[0].length;
        int r = matrix.length;
        int end = r*c-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int ans = matrix[mid/c][mid%c];
            if(ans<target)
                start=mid+1;
            else if(ans>target)
                end=mid-1;
            else
                return true;
        }
        return false;


        // int start = 0;
        // int end  = matrix.length;
        // int mid=0;
        // int start2 = 0;
        // int end2 = matrix[0].length;
        // int mid2;
        // int ans=-1;
        // while(start<=end){
        //     mid  = start + (end-start)/2;
        //     if((matrix[mid][matrix[0].length-1])<target)
        //         start=mid+1;
        //     else if(matrix[mid][0] > target)
        //         end = mid -1;
        //     else if(matrix[mid][0]<=target && target<=matrix[mid][matrix[0].length-1]){
        //         while(start<=end){
        //             mid2 = start2 + (end2-start2)/2;
        //             if(matrix[mid][mid2]<target)
        //                 start2 = mid2+1;
        //             else if(matrix[mid][mid2]>target)
        //                 end2 = mid2 -1;
        //             else
        //                 ans = matrix[mid][mid2];
        //         }
        //     }
                
        // }
        // if(ans>0)
        //     return true;
        // return false;
        
    }
}