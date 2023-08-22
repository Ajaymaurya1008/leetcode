class Solution {
    public String convertToTitle(int num) {
        String str = new String("");
        while(num!=0){
            num--;
            int m = num%26;
            str =  (char)(65+m)+str;
            num = num - m;
            num=num/26;
        }
           
        return str;
    }
}

// n/26 = A
// n%26 = B