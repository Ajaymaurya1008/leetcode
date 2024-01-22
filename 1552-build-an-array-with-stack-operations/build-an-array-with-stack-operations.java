class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        int count=1;
        for(int i=0;i<target.length;i++){
            if(target[i]==count){
                list.add("Push");
            }else{
                int diff = target[i]-count;
                for(int j=0;j<diff;j++){
                    list.add("Push");
                }
                for(int j=0;j<diff;j++){
                    list.add("Pop");
                    count++;
                }
                list.add("Push");
            }
            count++;
        }
        return list;
    }
}