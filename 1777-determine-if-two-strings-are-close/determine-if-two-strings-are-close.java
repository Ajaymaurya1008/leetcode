class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char m:word1.toCharArray()){
            map.put(m,map.getOrDefault(m,0)+1);
        }
        for(char m:word2.toCharArray()){
            map2.put(m,map2.getOrDefault(m,0)+1);
        }
        if(map.size()!=map2.size()){
            return false;
        }
        System.out.println(map);
        System.out.println(map2);
        if (!map.keySet().equals(map2.keySet())) {
            return false;
        }
        if (!Arrays.asList(map.values().stream().sorted().toArray())
        .equals(Arrays.asList(map2.values().stream().sorted().toArray()))) {
            return false;
        }
        return true;
    }
}