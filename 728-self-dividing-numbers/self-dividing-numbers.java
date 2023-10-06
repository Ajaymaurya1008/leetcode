class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =left;i<=right;i++){
            if(intLength(i))
                list.add(i);
        }
        return list;
    }
        static boolean intLength(int n){
            int m=n;
            while(n!=0){
                int rem = n%10;
                if(rem==0)
                    return false;
                if(m%rem!=0)
                    return false;
                n=n/10;
            }
            return true;
        }
}