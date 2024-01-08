class Solution {
    public int[] finalPrices(int[] prices) {
        int[] arr = new int[prices.length];
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<prices.length;i++){
            s.push(prices[i]);
            int m = list.size();
            for(int j=i+1;j<prices.length;j++){
                if(!s.isEmpty()){
                    int top=s.peek();
                    if(prices[j]<=top){
                        System.out.println(top);
                        list.add(top-prices[j]);
                        break;
                    }
                }
            }
            if(list.size()==m){
                list.add(prices[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}