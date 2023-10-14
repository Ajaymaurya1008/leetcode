class Solution {
    public int maxArea(int[] height) {
        int mul=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int ans = Math.min(height[l],height[r])*(r-l);
            mul = Math.max(mul,ans);
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }
        }
        return mul;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int ans = Math.min(height[i],height[j])*(j-i);
        //         if(ans>mul){
        //             mul=ans;
        //         }
        //     }
        // }
        // return mul;
    }
}