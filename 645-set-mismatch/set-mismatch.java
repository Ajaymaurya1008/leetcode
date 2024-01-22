class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int sum1=0,sum2=0;
        for(int i=1;i<=nums.length;i++) sum1+=i;
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums) {
            if(set.contains(i)){
                arr[0]=i;
            }else{
                set.add(i);
                sum2+=i;
            }
        }
        arr[1]=sum1-sum2;
        return arr;
    }
}