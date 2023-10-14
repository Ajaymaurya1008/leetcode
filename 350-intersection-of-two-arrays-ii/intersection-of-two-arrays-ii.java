class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 =new HashMap<>();
        HashMap<Integer,Integer> map2 =new HashMap<>();
        for(int i :nums1){
            if(!map1.containsKey(i)){
                map1.put(i,1);
            }else{
                map1.put(i,map1.get(i)+1);
            }
        }
        for(int i :nums2){
            if(!map2.containsKey(i) && map1.containsKey(i)){
                map2.put(i,1);
            }
            else if(map2.containsKey(i) && map2.get(i)+1<=map1.get(i)){
                map2.put(i,map2.get(i)+1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map2.entrySet()) {
            int key = e.getKey();
            int value = e.getValue();
            for (int i = 0; i < value; i++) {
                list.add(key);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}