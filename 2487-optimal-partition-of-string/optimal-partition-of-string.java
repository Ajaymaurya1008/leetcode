class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int count=0;
        for(char m:s.toCharArray()){
            if(!set.contains(m)){
                set.add(m);
            }else{
                set.clear();
                count++;
                set.add(m);
            }
        }
        return count+1;
    }
}