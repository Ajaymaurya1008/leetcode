class Solution {
    public boolean isPalindrome(int x) {
        if(revNum(x)==x)
            return true;
        return false;
    }

    static int revNum(int n){
        int rem = 0;
        int ans = 0;
        while(n!=0){
            rem = n%10;
            n = n/10;
            ans = ans*10 + rem;
        }
        return Math.abs(ans);
    }
}