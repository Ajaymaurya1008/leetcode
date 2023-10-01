class Solution {
    public boolean isHappy(int n) {
        while(n>9){
            n=check(n);
        }
        if(n== 1 ||n== 7)
            return true;
        return false;
    }

    static int check(int n){
        int ans = 0;
        int m= countDigits(n);
         for(int i = 0; i<m;i++){
            int rem = (n%10)*(n%10);
            ans+=rem;
            n=n/10;
        }
        return ans;
    }
    

    static int countDigits(int n){
        int count =0;
        while(n!=0){
            int rem = n%10;
            n = n/10;
            count++;
        }
        return count;
    }
}