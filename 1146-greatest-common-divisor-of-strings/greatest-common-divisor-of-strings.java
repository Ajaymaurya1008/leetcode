class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int m=-1;
        for(int i=0;i<str1.length();i++){
            sb.append(str1.charAt(i));
            if(isDivisible(str1,sb.toString()) && isDivisible(str2,sb.toString())){
                System.out.println(i);
                m=i;
            }
        }
        return str1.substring(0,m+1);
    }
    public static boolean isDivisible(String a,String x){
        int m = a.length();
        int n = x.length();
        if(m%n!=0) return false;
        int q = m/n;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<q;i++){
            sb.append(x);
        }
        if(a.equals(sb.toString())) return true;
        return false;
    }
}