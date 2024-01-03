class Solution {
    public int numberOfBeams(String[] bank) {
        int[] arr = new int[bank.length];
        for(int i=0;i<bank.length;i++){
            int count=0;
            String m = bank[i];
            for(int j=0;j<m.length();j++){
                if(m.charAt(j)=='1'){
                    count++;
                }
            }
            arr[i]=count;
        }
        int ans=0;
        int prev=0;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            ans+=arr[i]*prev;
            if(arr[i]!=0){
                prev=arr[i];
            }
        }
        return ans;
    }
}