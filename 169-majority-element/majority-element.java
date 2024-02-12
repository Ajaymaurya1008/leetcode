class Solution {
    public int majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                map.put(i,map.get(i)+1);
            }
        }
        int n =nums.length;
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            if(e.getValue()>n/2){
                list.add(e.getKey());
            }
        }
        int MAX = -1000000001;
        for(int i : list){
            if(i>MAX){
                MAX=i;
            }
        }
        return MAX;

    }
}