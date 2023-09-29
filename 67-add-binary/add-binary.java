import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int n1 = a.length()-1;
        int n2 = b.length()-1;
        int carry = 0,base=2;
        while(n1>=0 || n2>=0){
            int num1 =0,num2 =0,sum;
            if(n1>=0)
                num1 = a.charAt(n1--) - '0';
            if(n2>=0)
                num2 = b.charAt(n2--) - '0';
            sum = num1 + num2 + carry; // sum = 1 + 0 + 1 = 0 & 1 carry
            if(sum>=base){
                carry = 1;
                sum = sum - base;
            }else{
                carry = 0;
            }
            ans.append(sum);
        }
        if(carry==1){
            ans.append(1);
        }
        return ans.reverse().toString();
        // BigInteger p = new BigInteger(a,2);
        // BigInteger q = new BigInteger(b,2);
        // BigInteger sum = p.add(q);
        // return sum.toString(2);
        // return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }
}