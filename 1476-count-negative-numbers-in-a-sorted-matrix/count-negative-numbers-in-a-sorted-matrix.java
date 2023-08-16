class Solution {
    public int countNegatives(int[][] grid) {
        int i = 0;
        int j = grid[0].length - 1;
        int count = 0;
        
        while (i < grid.length && j >= 0) {
            if (grid[i][j] < 0) {
                count += (grid.length - i);
                j--; 
            } else if (grid[i][j] >= 0) {
                i++;
            }
        }
        
        return count;
        // int start=0;
        // int end = grid[0].length-1;
        // int mid;
        // int sum =0;
        // for(int i = 0; i <grid.length;i++){
        // while(start<=end){
        //     mid = start + (end-start)/2;
        //     if(mid>0){
        //         start = mid+1;
        //     }
        //     else if(mid<0){
        //         end = mid;
        //     }
        //     else{
        //         sum+= grid.length-mid;
        //     }
        // }
        // }
        // return sum;
    }
}


        // int count=0;
        // for(int i = 0; i <grid.length;i++){
        //     for(int j =0;j<grid[0].length;j++){
        //         if(grid[i][j]<0)
        //             count ++;
        //     }
        // }
        // return count;
