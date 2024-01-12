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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode middle = findMiddle(head);
        System.out.println(middle.val);
        if(middle.next!=null){
        middle.val=middle.next.val;
        middle.next=middle.next.next;
        }else{
            head.next=null;
        }
        return head;
    }
    static ListNode findMiddle(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}