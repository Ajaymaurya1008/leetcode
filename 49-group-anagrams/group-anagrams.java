class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        String[] copyStr = new String[strs.length];
        for(int i=0;i<strs.length;i++){
            String mm = strs[i];
            char[] arr = mm.toCharArray();
            Arrays.sort(arr);
            String nn = new String(arr);
            copyStr[i] = nn;
        }
        for(int i=0;i<strs.length;i++){
            String mm = copyStr[i];
            String mmk = strs[i];
            if(!list.stream().anyMatch(sublist -> sublist.contains(mmk))){
                List<String> inner = new ArrayList<>();
                inner.add(mmk);
                for(int j=i+1;j<strs.length;j++){
                    String nn = copyStr[j];
                    String kk = strs[j];
                    if(mm.equals(nn)){
                        inner.add(kk);
                    }
                }
                list.add(inner);
            }
        }
        // Collections.sort(list, new Comparator<List<String>>() {
        //     @Override
        //     public int compare(List<String> list1, List<String> list2) {
        //         return list1.get(0).compareTo(list2.get(0));
        //     }
        // });
        System.out.println(Arrays.toString(copyStr));
        return list;
    }
}