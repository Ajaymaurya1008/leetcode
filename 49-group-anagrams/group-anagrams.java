class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            map.computeIfAbsent(sortedWord,w->new ArrayList<>()).add(s);
        }
        return new ArrayList<List<String>>(map.values());


        // Map<String, List<String>> map = new HashMap<String, List<String>>();
        // for (String s : strs) {
        //     char[] arr = s.toCharArray();
        //     Arrays.sort(arr);
        //     String key = new String(arr);
        //     map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        // }
        // System.out.println(map);
        // return new ArrayList<List<String>>(map.values());


        // List<List<String>> list = new ArrayList<>();
        // String[] copyStr = new String[strs.length];
        // for(int i=0;i<strs.length;i++){
        //     String mm = strs[i];
        //     char[] arr = mm.toCharArray();
        //     Arrays.sort(arr);
        //     String nn = new String(arr);
        //     copyStr[i] = nn;
        // }
        // for(int i=0;i<strs.length;i++){
        //     String mm = copyStr[i];
        //     String mmk = strs[i];
        //     if(!list.stream().anyMatch(sublist -> sublist.contains(mmk))){
        //         List<String> inner = new ArrayList<>();
        //         inner.add(mmk);
        //         for(int j=i+1;j<strs.length;j++){
        //             String nn = copyStr[j];
        //             String kk = strs[j];
        //             if(mm.equals(nn)){
        //                 inner.add(kk);
        //             }
        //         }
        //         list.add(inner);
        //     }
        // }
        // return list;
    }
}