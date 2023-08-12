// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         for(int i=1;i<=arr[arr.length-1]+k+1;i++){
//             list.add(i);
//         }
//         for(int i=0;i<arr.length;i++){
//             list.remove(Integer.valueOf(arr[i]));
//         }
//         return list.get(k-1);
//     }
// }

class Solution { 
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int ans = 1;
        int idx = 0;

        while(idx < arr.length && count < k) {
            if(arr[idx]==ans) {
                ans++;
                idx++;
            }
            else {
                ans++;
                count++;
            }
        }

        while(count < k) {
            ans++;
            count++;
        }
        
        return ans-1;
    }
}

// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int num = 1; // Current positive integer to check
//         int count = 0; // Count of missing positive integers
//         int i = 0; // Index for the input array
        
//         while (count < k) {
//             if (i < arr.length && arr[i] == num) {
//                 i++; // Move to the next element in the array
//             } else {
//                 count++; // Increment the count of missing positive integers
//             }
//             num++; // Move to the next positive integer
//         }
        
//         return num - 1; // The k-th missing positive integer
//     }
// }
