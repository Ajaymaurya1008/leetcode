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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size =0;
        if(head.next==null){
            head=null;
            return head;
        }
        ListNode current = head;
        while(current!=null){
            current=current.next;
            size++;
        }
        if(size-n==0) return head.next;
        ListNode current2=head;
        int count=0;
        while(current2!=null){
            if(count==size-n-1){
                current2.next=current2.next.next;
            }else{
                current2=current2.next;
            }
            count++;
        }
        return head;
    }
}