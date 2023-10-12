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
public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();
        int n = nums.length;
        int threshold = n / 3;

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}