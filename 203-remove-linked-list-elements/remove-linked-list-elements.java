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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val){
            head = head.next;
        }
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.next.val==val){
                System.out.println("v");
                current.next=current.next.next;
            }else{
                System.out.println("h");
                current=current.next;
            }
        }
        return head;
    }
}