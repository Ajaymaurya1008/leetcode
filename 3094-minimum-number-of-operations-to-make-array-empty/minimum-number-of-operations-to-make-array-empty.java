class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :nums)
            map.put(i,map.getOrDefault(i,0)+1);
        int count=0;
        for(int i:map.values()){
            System.out.println(i);
            if(i==1) return -1;
            count += i / 3; 
            if (i % 3 != 0)
                count++;
        }
        return count;
    }
}
