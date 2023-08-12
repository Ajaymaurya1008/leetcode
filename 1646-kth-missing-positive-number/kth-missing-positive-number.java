class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=arr[arr.length-1]+k+1;i++){
            list.add(i);
        }
        for(int i=0;i<arr.length;i++){
            list.remove(Integer.valueOf(arr[i]));
        }
        return list.get(k-1);
    }
}