class Solution {
    public int arrangeCoins(int n) {
        ArrayList<Long> list = new ArrayList<Long>();
        long i = 1;
        long sum=1;
        while(sum<=n){
            list.add(i);
            i++;
            sum+=i;
        }
        return list.size();
    }
}