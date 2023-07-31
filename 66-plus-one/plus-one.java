class Solution {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length-1; i>=0 ; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;




        // String ans = "";
        // for(int i=0;i<digits.length;i++){
        //     ans += digits[i];
        // }
        // int m = Integer.parseInt(ans);
        // m++;
        // int k =m;
        // int count = 1;
        // while(m!=0){
        //     m = m/10;
        //     count++;
        // }
        // int n = count -1;
        // int[] plus = new int[n];
        // for(int i=n-1;i>-1;i--){
        //     plus[i] = k%10;
        //     k = k/10 ;
        // }
        // return plus;
        
    }
}