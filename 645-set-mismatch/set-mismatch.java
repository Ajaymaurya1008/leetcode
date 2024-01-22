class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                arr[0]=nums[i];
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        Integer[] num = set.toArray(new Integer[set.size()]); 
        System.out.println(Arrays.toString(num));
        for(int i=0;i<num.length;i++){
            if(num[i]!=i+1){
                arr[1]=i+1;
                break;
            }
        }
        if(arr[1]==0) arr[1]=nums.length;

        // HashSet<Integer> set = new HashSet<>();
        // for(int i:nums) {
        //     if(set.contains(i)){
        //         arr[0]=i;
        //     }else{
        //         set.add(i);
        //     }
        // }
        // System.out.println(set);
        return arr;
    }
}