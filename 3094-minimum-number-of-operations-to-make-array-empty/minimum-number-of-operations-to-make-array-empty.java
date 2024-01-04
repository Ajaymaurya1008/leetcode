class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i :nums)
            map.put(i,map.getOrDefault(i,0)+1);
        int count=0;
        for(int i:map.values()){
            int rem = i % 3;
            while(i>0){
                if(i-2<0){
                    return -1;
                }
                else if(rem==0){
                    count+=i/3;
                    i=0;
                }else if(rem==1){
                    i=i-2;
                    count++;
                    rem=i%3;
                }else if(rem==2){
                    i=i-2;
                    count++;
                    rem=i%3;
                }
            }
        }
        return count;
    }
}
