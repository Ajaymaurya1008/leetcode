class Solution {
    public int findJudge(int n, int[][] trust) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=1;i<=n;i++) set.add(i);
        for(int i=0;i<trust.length;i++){
            set.remove(trust[i][0]);
        }
        int ans =-1;
        for(int i:set) ans=i;
        int p=n-1;
        System.out.println(p);
        for(int i=0;i<trust.length;i++){
            if(trust[i][1]==ans) p--;
        }
        if(p==0) return ans;

        return -1;
    }
}