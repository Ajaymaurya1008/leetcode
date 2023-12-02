class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        for(int i =0;i<words.length;i++){
            String m = words[i];
            if(isSub(m,chars)){
                count += m.length();
            }
        }
        return count;
    }

    static boolean isSub(String s,String m){
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i =0 ; i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for(int i =0 ; i<m.length();i++){
            if(!map2.containsKey(m.charAt(i))){
                map2.put(m.charAt(i),1);
            }else{
                map2.put(m.charAt(i),map2.get(m.charAt(i))+1);
            }
        }
        System.out.println(map);
        System.out.println(map2);
        for(int i=0;i<s.length();i++){
            if(!(map2.containsKey(s.charAt(i)) && (map.get(s.charAt(i))<=map2.get(s.charAt(i)))) ){
                return false;
            }
        }
        return true;
    }
}