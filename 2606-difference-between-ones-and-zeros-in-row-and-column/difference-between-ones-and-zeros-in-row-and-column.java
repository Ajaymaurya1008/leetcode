class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] diff = new int[grid.length][grid[0].length];
        int[] rowZero = new int[grid.length];
        for(int i =0;i<diff.length;i++){
            rowZero[i] = rowSum0(grid,i);
        }
        int[] rowOne = new int[grid.length];
        for(int i =0;i<diff.length;i++){
            rowOne[i] = rowSum1(grid,i);
        }
        int[] colOne = new int[grid[0].length];
        for(int i =0;i<diff[0].length;i++){
            colOne[i] = colSum1(grid,i);
        }
        int[] colZero = new int[grid[0].length];
        for(int i =0;i<diff[0].length;i++){
            colZero[i] = colSum0(grid,i);
        }

        for(int i =0;i<diff.length;i++){
            int row1 = rowOne[i];
            int row0 = rowZero[i];
            for(int j=0;j<diff[0].length;j++){
                int col0 = colZero[j];
                int col1 = colOne[j];
                diff[i][j] = row1+col1-row0-col0;
            }
        }
        return diff;
    }

    static int rowSum1(int[][] mat,int row){
        int sum =0;
        for(int i=0;i<mat[0].length;i++){
            if(mat[row][i]==1){
                sum++;
            }
        }
        return sum;
    }
    static int rowSum0(int[][] mat,int row){
        int sum =0;
        for(int i=0;i<mat[0].length;i++){
            if(mat[row][i]==0){
                sum++;
            }
        }
        return sum;
    }

    static int colSum0(int[][] mat,int col){
        int sum =0;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]==0){
                sum++;
            }
        }
        return sum;
    }
      static int colSum1(int[][] mat,int col){
        int sum =0;
        for(int i=0;i<mat.length;i++){
            if(mat[i][col]==1){
                sum++;
            }
        }
        return sum;
    }
}