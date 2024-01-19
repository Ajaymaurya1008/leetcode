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
    public ListNode mergeNodes(ListNode head) {
        ListNode current = head.next;
        int count=1;
        int sum=0;
        ListNode newNode = new ListNode();
        head = newNode;
        while(current!=null){
            if(current.val==0){
                newNode.next=new ListNode();
                newNode=newNode.next;
                newNode.val=sum;
                sum=0;
            }else{
                sum+=current.val;
            }
            current=current.next;
        }
        return head.next;
    }
}