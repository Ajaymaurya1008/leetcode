class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            list.add(new ArrayList<>());
        }
        List<Integer> inner = new ArrayList<>();
        for(int i:nums){
            int occurence = map.get(i);
            for(int j=0;j<occurence;j++){
                if(!list.get(j).contains(i))
                    list.get(j).add(i);
            }
        }
        return list;
    }
}