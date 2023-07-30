class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image[0].length];
        for(int i =0; i < image.length; i++){
            int m =0;
            for(int j = image[0].length-1; j>-1 ; j--){
                arr[i][m]=image[i][j];
                m++;
            }
        }
        for(int i =0; i < image.length; i++){
            for(int j=0; j<image[0].length ; j++){
                arr[i][j] = arr[i][j]==1?0:1;
                // if(arr[i][j] == 0)
                //     arr[i][j]=1;
                // else
                //     arr[i][j]=0;
            }
        }
        // int[][] arr3 = new int[image.length][image[0].length];
        // for(int i =0; i < image.length; i++){
        //     for(int j = image[0].length-1; j>-1 ; j--){
        //         arr3[i][j]=arr2[i][j];
        //     }
        // }
        return arr;

    }
}