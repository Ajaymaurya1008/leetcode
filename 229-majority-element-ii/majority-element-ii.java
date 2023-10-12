class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        int n = nums.length;
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            if(ent.getValue()>n/3){
                list.add(ent.getKey());
            }
        }
        return list;
    }
}