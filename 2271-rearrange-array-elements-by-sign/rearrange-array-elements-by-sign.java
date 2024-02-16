class Solution {
    public int[] rearrangeArray(int[] nums) {
        // ArrayList<Integer> list1 = new ArrayList<>();
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            if(i<0){
                q1.add(i);
            }else{
                q2.add(i);
            }
        }
        System.out.println(q1);
        System.out.println(q2);
        while(!q1.isEmpty() && !q2.isEmpty()){
            list.add(q2.remove());
            list.add(q1.remove());
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i] = list.get(i);
        return arr;
    }
}