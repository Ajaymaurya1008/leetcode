class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int start=0;
        int end = s.length()-1;
        int max=-1;
        for(int i=0;i<s.length();i++){
            for(int j=end;j>i;j--){
                if(s.charAt(i)==s.charAt(j)){
                    int ans = j-i-1;
                    max = Math.max(max,ans);
                }
            }
        }

        return max;
    }
}