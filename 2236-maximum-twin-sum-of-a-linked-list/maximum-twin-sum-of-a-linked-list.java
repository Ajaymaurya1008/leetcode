/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current!=null){
            list.add(current.val);
            current=current.next;
        }
        System.out.println(list);
        int n=list.size();
        int max=0;
        for(int i=0;i<=(n/2)-1;i++){
            int sum = list.get(i) + list.get(n-i-1);
            max = Math.max(sum,max);
        }
        return max;
    }
}