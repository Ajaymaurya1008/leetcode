class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        int sum2=0;
        char m = 'j';
        for(int i =0;i<s.length();i++){
            sum1+= (int)s.charAt(i);
        }
        for(int j =0;j<t.length();j++){
            sum2+= (int)t.charAt(j);
        }
        int sum = sum2-sum1;
        char ans = (char)sum;

        return ans;
        // int count =0;
        // for(int i =0;i<t.length();i++){
        //     for(int j =0;j<s.length();j++){
        //         if(t.charAt(i)==s.charAt(j)){
        //             count++;
        //             System.out.println(count);
        //         }
        //     }
        //     if(count==0){
        //         return t.charAt(i);
        //     }
        //     count=0;
        // }
        // return 0;

        // for(int i=0,j=0;i<CharAt(s.length()),j<CharAt(t.length());i++,j++){
        //     if(CharAt(i)!=CharAt(j))
        // }
    }
}