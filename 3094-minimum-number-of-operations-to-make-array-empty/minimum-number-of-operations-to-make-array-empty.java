class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :nums)
            map.put(i,map.getOrDefault(i,0)+1);
        int count=0;
        for(int i:map.values()){
            System.out.println(i);
            if(i==1) return -1;
            count += Math.ceil((double)i / 3);
        }
        return count;
    }
}
