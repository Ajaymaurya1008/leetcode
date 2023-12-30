class Solution {
    public boolean makeEqual(String[] words) {
        int sum =0;
        for(int i=0;i<words.length;i++){
            String ans = words[i];
            sum+=ans.length();
        }
        if(sum%words.length!=0){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            String ans = words[i];
            for(int j=0;j<ans.length();j++){
                if(map.containsKey(ans.charAt(j))){
                    map.put(ans.charAt(j),map.get(ans.charAt(j))+1);
                }else{
                    map.put(ans.charAt(j),1);
                }
            }
        }
        
        for(int val:map.values()){
            if(val%words.length!=0) return false;
        }
        return true;
    }
}