class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int maxIndex =-1;
        for(int i=0;i<matrix[0].length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]>max){
                    max = matrix[j][i];
                    maxIndex=j;
                }
            }
            list.add(matrix[maxIndex][i]);
        }
        System.out.println(list);
        for(int i=0;i<matrix.length;i++){
            int min=arrMin(matrix[i]);
            if(matrix[i][min]==list.get(min)){
                list2.add(matrix[i][min]);
            }
        }
        return list2;
    }
    public static int arrMin(int[] list){
        int min = Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<list.length;i++){
            if(list[i]<min){
                min=list[i];
                index=i;
            }
        }
        return index;
    }
}