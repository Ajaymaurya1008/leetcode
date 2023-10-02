class Solution {
    public boolean isPowerOfFour(int n) {
        double ans = Math.log(n)/Math.log(4);
        if(ans%1==0)
            return true;
        return false;
    }
}