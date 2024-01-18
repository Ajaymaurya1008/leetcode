class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        int total=0;
        int n=cardPoints.length;
        for(int m=0;m<n;m++){
            total+=cardPoints[m];
            sum+=cardPoints[m];
            if(j-i+1<n-k){
                j++;
            }else if(j-i+1==n-k){
                min=Math.min(sum,min);
                System.out.println(min);
                sum=sum-cardPoints[i];
                i++;j++;
            }
        }
        if(min==Integer.MAX_VALUE)min=0;
        return total-min;
    }
}