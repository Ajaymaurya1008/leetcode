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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode something = head;
        while(something!=null && something.next!=null){
            if(something.val==something.next.val){
                something.next = something.next.next;
            }else{
                something=something.next;
            }
        }
        return head;
    }
}