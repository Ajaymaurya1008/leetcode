class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int dist =0;
        for(int i =1;i<points.length;i++){
            int x = Math.abs(points[i][0] - points[i-1][0]);
            int y = Math.abs(points[i][1] - points[i-1][1]);
            int ans = Math.max(x,y);
            dist += ans;
            // int largeVal = large(points[i]);
            // int smallVal = small(points[i-1]);
            System.out.println(ans);
        }
        return dist;
    }
    static int large(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    static int small(int[] arr){
        int max = Integer.MAX_VALUE;
        for(int i:arr){
            if(i<max){
                max=i;
            }
        }
        return max;
    }
}