class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}



// class Solution {
//     public int removeDuplicates(int[] nums) {
//         HashSet<Integer> set = new HashSet();
//         for(int i :nums){
//             set.add(i);
//         }
//         // for (int i = 0; i < nums.length; i++) {
//         //     nums[i] = 0;
//         // }
//         List<Integer> list = new ArrayList<>(set);
//         int[] arr = new int[list.size()];
        
//         for(int i =0;i<list.size();i++){
//             arr[i] = list.get(i);
//         }
//         System.out.println(Arrays.toString(nums));        
//         return nums.length;
//     }
// }
