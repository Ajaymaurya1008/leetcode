class Solution {
    public int arrangeCoins(int n) {

        return (int)(Math.sqrt(2 * (long)n + 0.25) - (0.5));


        // int i = 1;
        // int count =0;
        // while(i<=n){
        //     n-=i;
        //     count++;
        //     i++;
        // }
        // return count;

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