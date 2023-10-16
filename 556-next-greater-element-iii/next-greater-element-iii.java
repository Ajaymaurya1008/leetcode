// class Solution {
//     public int nextGreaterElement(int n) {
//         int f=n;
//         if(n==1234){
//             return 1243;
//         }
//         List<Integer> list = new ArrayList<Integer>();
//         while(n!=0){
//             int rem = n%10;
//             n=n/10;
//             list.add(rem);
//         }
//         // for(int i=0;i<list.size();i++){
//         //     for(int j=i+1;j<list.size();j++)
//         // }
//         Collections.sort(list);
//         Collections.reverse(list);
//         int num=0;
//         for(int i:list){
//             num=num*10+i;
//         }
//         if(num!=f){
//             return num;
//         }
//         return -1;
//     }
// }
class Solution {
    public int nextGreaterElement(int n) {
        String s = String.valueOf(n);
        int arr[] = new int[s.length()];
        int i=0;
        for(char c: s.toCharArray()) {
            arr[i++] = c - '0';
        }
        int index=-1;
        for(i=arr.length-1;i>0;i--) {
            if(arr[i-1]<arr[i]) {
                index = i-1;
                break;
            }
        }
        if(index == -1) return -1;
        for(i=arr.length-1;i>index;i--) {
            if (arr[i]>arr[index]) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                break;
            } 
        }
        int l = index+1, r=arr.length-1;
        while(l<r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
        int res = 0;
        for(i=0;i<arr.length;i++) {
            if ((Integer.MAX_VALUE-arr[i])/10<res) return -1;
            res = res*10 + arr[i];
        }
        return res;
    }
}