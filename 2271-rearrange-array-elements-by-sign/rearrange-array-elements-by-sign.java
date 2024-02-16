class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(i<0){
                q1.add(i);
            }else{
                q2.add(i);
            }
        }
        while(!q1.isEmpty() && !q2.isEmpty()){
            list.add(q2.remove());
            list.add(q1.remove());
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i] = list.get(i);
        return arr;
    }
}