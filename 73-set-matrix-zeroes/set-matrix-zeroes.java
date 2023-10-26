class Solution {
    public void setZeroes(int[][] matrix) {
        util1(matrix);
    }
    public void util1(int[][] matrix) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (hm.containsKey(i)) {
                        hm.get(i).add(j);
                    } else {
                        List<Integer> l = new ArrayList<>(Arrays.asList(j));
                        hm.put(i, l);
                    }
                }
            }
        }
        for (Map.Entry<Integer, List<Integer>> en : hm.entrySet()) {
            int key = en.getKey();
            List<Integer> value = en.getValue();
            Arrays.fill(matrix[key], 0);
            for (int j : value) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}