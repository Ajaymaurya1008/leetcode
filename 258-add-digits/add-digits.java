class Solution {
    public int addDigits(int num) {
        int sum =0;
        if(num==0)
            return 0;
        while(num!=0){
            int digit = num%10;
            sum+=digit;
            num = num/10;
            if(num==0 && digitCount(sum)>1){
                num=sum;
                sum=0;
            }
        }
        return sum;
    }

    static int digitCount(int n){
        int count =0;
        while (n > 0) {
            int d = n % 10;
            n = n/10;
            count++;
        }
        return count;
    }
}