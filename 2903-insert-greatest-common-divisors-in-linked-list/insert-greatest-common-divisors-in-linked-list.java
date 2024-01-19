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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;
        while(current!=null && current.next!=null){
            int num1 = current.val;
            int num2 = current.next.val;
            int gcd = gcdCalc(num1,num2);
            ListNode middle = new ListNode();
            middle.val=gcd;
            middle.next=current.next;
            current.next=middle;
            current=current.next.next;
        }
        return head;
    }
    static int gcdCalc(int num1,int num2){
        int gcd=1;
        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}