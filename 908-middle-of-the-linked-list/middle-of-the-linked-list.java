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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode current=head;
        while(current!=null){
            current=current.next;
            count++;
        }
        int middle=0;
        if(count%2==0){
            middle = (int)Math.ceil(count / 2.0) +1;
        }else{
            middle = (int)Math.ceil(count / 2.0);
        }
        int countNew=1;
        ListNode some=head;
        while(countNew!=middle){
            some=some.next;
            countNew++;
        }
        return some;
    }
}