class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<nums2.length;i++){
            int element = nums2[i];
            while(!s.isEmpty() && nums2[i]>nums2[s.peek()]){
                int prev = s.pop();
                map.put(nums2[prev],i);
            }
            s.push(i);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                arr[i]=nums2[map.get(nums1[i])];
            }else{
                arr[i]=-1;
            }
        }
        return arr;
    }
}