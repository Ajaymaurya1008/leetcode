class Solution {
    public int maxScore(String s) {
        StringBuilder sb = new StringBuilder(s);
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            int zero =0;
            for(int j=0;j<=i;j++){
                if(s.charAt(j)=='0'){
                    zero++;
                    System.out.println("zero");
                }
            }
            int one =0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    one++;
                    System.out.println("one");
                }
            }
            System.out.println(zero);
            System.out.println(one);
            int newMax = zero+one;
            System.out.println(newMax);
            max = Math.max(max,newMax);
        }
        return max;
    }
}