class Solution {
    public boolean makeEqual(String[] words) {
        int sum =0;
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
            sum+=ans.length();
        }
        // String a = words[0];
        // int m = map.get(a.charAt(0));
        // double ans = (double) m/words.length;
        // if(ans%1!=0){
        //     return false;
        // }
        System.out.println(map);
        for(int val:map.values()){
            double ans = (double) val/words.length;
            if(ans%1!=0){
                return false;
            }
        }
        // double ans = (double) sum/words.length;
        // if(ans%1!=0){
        //     return false;
        // }
        return true;
    }
}