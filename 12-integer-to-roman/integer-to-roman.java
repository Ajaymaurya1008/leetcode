class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> d = new HashMap<>();
        // StringBuilder str = new StringBuilder("");
        d.put(1000, "M");
        d.put(900,"CM");
        d.put(500, "D");
        d.put(400, "CD");
        d.put(100, "C");
        d.put(90, "XC");
        d.put(50, "L");
        d.put(40, "XL");
        d.put(10, "X");
        d.put(9, "IX");
        d.put(5, "V");
        d.put(4, "IV");
        d.put(1, "I");
        
        String ans ="";
        int k[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        while(num!=0){
            for(int i=0;i<13;i++){
                if(num-k[i]>=0){
                    num = num-k[i];
                    ans += d.get(k[i]);
                    break;
                }
            }
        }
        // return ans;
        // for(Map.Entry<String,Integer> e : map.entrySet()){
        //     if(num==0){
        //         break;
        //     }
        //     if(e.getValue()>num){
        //         num = num-(e-1).getValue();
        //         str = str+(e-1).getKey();
        //     }
        // }
        // String ans = str.toString();
        return ans;
    }
}