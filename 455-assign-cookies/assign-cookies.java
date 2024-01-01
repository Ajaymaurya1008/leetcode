class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(s[j]>=g[i]){
                    count++;
                    System.out.println(s[j]);
                    System.out.println(g[i]);
                    s[j]=0;
                    break;
                }
            }
        }
        return count;
    }
}