class Solution {
    public boolean isPerfectSquare(int num) {
        boolean ans = false;
        long start= 0;
        long end = num;
        long mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(mid*mid<num){
                start=mid+1;
            }
            else if(mid*mid>num){
                end=mid-1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}