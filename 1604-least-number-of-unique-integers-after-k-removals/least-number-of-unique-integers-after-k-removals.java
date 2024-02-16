class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashMap<Integer,Integer> maps = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> maps.put(x.getKey(),x.getValue()));
        for(Map.Entry<Integer,Integer> e:maps.entrySet()) {
            int i = e.getValue();
            if(i<=k){
                k=k-i;
                maps.put(e.getKey(),0);
            }
        }
        int count =0;
        for(int i:maps.values()) {
            if(i!=0) count++;
        } 
        return count;
    }
}