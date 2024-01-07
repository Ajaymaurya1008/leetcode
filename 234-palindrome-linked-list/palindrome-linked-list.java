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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }

        ListNode middle = findMiddle(head);
        ListNode reverse = reverseList(middle.next);
        ListNode current=head;
        while(reverse!=null ){
            if(current.val!=reverse.val){
                return false;
            }
            current=current.next;
            reverse=reverse.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current!=null){
            ListNode nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head){
        ListNode hare=head;
        ListNode turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
        }
        return turtle;
    }
}