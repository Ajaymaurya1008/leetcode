class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        int count=0;
        for(int i=0;i<2*nums.length;i++){
            int j=i%nums.length;
            while(!s.isEmpty() && nums[j]>nums[s.peek()]){
                int index = s.pop();
                arr[index] = nums[j];
            }        
            s.push(j);
        }
        return arr;
    }
}