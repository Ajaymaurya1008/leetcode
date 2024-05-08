class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] sortedArr = Arrays.copyOf(score,score.length);
        Arrays.sort(sortedArr);
        String[] arr = new String[score.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<sortedArr.length;i++){
            map.put(sortedArr[i],sortedArr.length-i);
        }
        System.out.println(map);
        System.out.println(Arrays.toString(sortedArr));
        for(int i=0;i<score.length;i++){
            System.out.println(map.get(score[i]));
            if(map.get(score[i])==1){
                arr[i] = "Gold Medal";
            }else if(map.get(score[i])==2){
                arr[i]="Silver Medal";
            }else if(map.get(score[i])==3){
                arr[i]="Bronze Medal";
            }else{
                arr[i]=""+map.get(score[i]);
            }
        }
        return arr;
    }
}