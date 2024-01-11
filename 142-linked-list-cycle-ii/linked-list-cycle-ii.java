/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode one = head;
        ListNode two = head;
        while(two!=null && two.next!=null){
            one=one.next;
            two=two.next.next;
            if(one==two){
                two=head;
                while(one!=two){
                    two=two.next;
                    one=one.next;
                }
                return one;
            }
        }
        return null;
    }
}