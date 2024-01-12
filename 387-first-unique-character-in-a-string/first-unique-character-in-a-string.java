class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char m:s.toCharArray()){
            map.put(m,map.getOrDefault(m,0)+1);
        }
        for(int i=0;i<s.length();i++){
            int m = map.get(s.charAt(i));
            if(m==1){
                return i;
            }
        }
        return -1;
    }
}