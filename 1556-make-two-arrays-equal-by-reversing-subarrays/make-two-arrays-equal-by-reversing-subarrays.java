class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i:target) map.put(i,map.getOrDefault(i,0)+1);
        for(int i:arr) map2.put(i,map2.getOrDefault(i,0)+1);
        for(int i:target){
            if(map.containsKey(i) && map2.containsKey(i)){
                int a =map.get(i);
                int b =map2.get(i);
                if(a!=b) return false;
            }else{
                return false;
            }
        }
        return true;
    }
}