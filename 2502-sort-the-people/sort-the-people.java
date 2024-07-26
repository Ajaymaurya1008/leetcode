class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] arr = new String[names.length];
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            arr[i]=map.get(heights[heights.length-i-1]);
        }
        return arr;
    }
} 