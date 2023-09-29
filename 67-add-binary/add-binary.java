import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger p = new BigInteger(a,2);
        BigInteger q = new BigInteger(b,2);
        BigInteger sum = p.add(q);
        return sum.toString(2);
        // return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }
}