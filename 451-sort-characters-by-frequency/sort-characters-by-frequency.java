class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char m:s.toCharArray()){
            map.put(m,map.getOrDefault(m,0)+1);
        }
        System.out.println(map);
        System.out.println(map.get(s.charAt(2)));
        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(map.entrySet());
        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue())); 
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            char character = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                sb.append(character);
            }
        }
        return sb.toString();
    }
}