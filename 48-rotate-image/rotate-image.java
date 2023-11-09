class Solution {
    public void rotate(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m-1;i++){
            for(int j = i;j<n;j++){
                swap(matrix,i,j,j,i);
            }
        }
        for(int i=0;i<m;i++){
            reverse(matrix[i]);
        }
    }

    public void swap(int[][] arr,int i,int j,int m,int n){
        int temp = arr[i][j];
        arr[i][j] = arr[m][n];
        arr[m][n] = temp;
    }

    public void swap2(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public void reverse(int[] arr){
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            swap2(arr,i,n-1-i);
        }
    }
}

// int m = matrix.length;
        // int n = matrix[0].length;
        // int[][] mat = new int[m][n];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         mat[j][n-1-i]=matrix[i][j];
        //     }
        // }
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         matrix[i][j]=mat[i][j];
        //     }
        // }