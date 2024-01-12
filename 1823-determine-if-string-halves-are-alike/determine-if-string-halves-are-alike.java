class Solution {
    public boolean halvesAreAlike(String s) {
        int count=0;
        for(int i=0;i<s.length()/2;i++){
            if("aeiou".indexOf(Character.toLowerCase(s.charAt(i))) != -1){
                count++;
            }
        }
        for(int i=s.length()/2;i<s.length();i++){
            if("aeiou".indexOf(Character.toLowerCase(s.charAt(i))) != -1){
                count--;
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
}