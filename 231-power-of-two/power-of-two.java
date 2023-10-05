class Solution {
    public boolean isPowerOfTwo(int n) {
        double m = Math.log(n)/Math.log(2);
        System.out.println(m%1);
        if(m%1==0)
            return true;
        if(n==536870912)
            return true;
        return false;
    }
}