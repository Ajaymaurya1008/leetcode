class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        // Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
            // s.push(nums2[i]);
        }
        // System.out.println(s);
        System.out.println(map);
        for(int i=0;i<nums1.length;i++){
            int num = map.get(nums1[i]);
            System.out.println(num);
            // System.out.println(num);
            if(num+1==nums2.length){
                arr[i]=-1;
                continue;
            }
            for(int j=num+1;j<nums2.length;j++){
                if(nums2[j]>nums2[num]){
                    System.out.println(nums2[j]);
                    arr[i]=nums2[j];
                    break;
                }else{
                    arr[i]=-1;
                }
            }
        }
        return arr;
    }
}