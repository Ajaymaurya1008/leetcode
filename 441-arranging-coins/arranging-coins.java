class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        int count =0;
        while(i<=n){
            n-=i;
            count++;
            i++;
        }
        return count;

        // ArrayList<Long> list = new ArrayList<Long>();
        // long i = 1;
        // long sum=1;
        // while(sum<=n){
        //     list.add(i);
        //     i++;
        //     sum+=i;
        // }
        // return list.size();
    }
}