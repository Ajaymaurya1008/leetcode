// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         ArrayList<Integer> list = new ArrayList<>();
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i:nums){
//             if(!map.containsKey(i)){
//                 map.put(i,1);
//             }else{
//                 map.put(i,map.get(i)+1);
//             }
//         }
//         int n = nums.length;
//         for(Map.Entry<Integer,Integer> ent : map.entrySet()){
//             if(ent.getValue()>n/3){
//                 list.add(ent.getKey());
//             }
//         }
//         return list;
//     }
// }
// public class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         List<Integer> result = new ArrayList<>();
//         Map<Integer, Integer> counts = new HashMap<>();
//         int n = nums.length;
//         int threshold = n / 3;

//         for (int num : nums) {
//             counts.put(num, counts.getOrDefault(num, 0) + 1);
//         }

//         for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
//             if (entry.getValue() > threshold) {
//                 result.add(entry.getKey());
//             }
//         }

//         return result;
//     }
// }


public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
        
        for (int num : nums) {
            if (candidate1 == num) count1++;
            else if (candidate2 == num) count2++;
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        count1 = count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }
        
        List<Integer> ans = new ArrayList<>();
        if (count1 > nums.length / 3) ans.add(candidate1);
        if (count2 > nums.length / 3) ans.add(candidate2);
        
        return ans;
    }
}