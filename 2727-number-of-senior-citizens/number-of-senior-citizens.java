class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(String i:details){
            char a = i.charAt(11);
            char b = i.charAt(12);
            int n = (a-'0')*10 + b-'0';
            if(n>60) count++;
        }
        return count;
    }
}