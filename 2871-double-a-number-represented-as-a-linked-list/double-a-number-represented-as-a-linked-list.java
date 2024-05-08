import java.math.BigInteger;
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
    public ListNode doubleIt(ListNode head) {
        StringBuilder str = new StringBuilder();
        ListNode current = head;
        while(current!=null){
            str.append(current.val);
            current=current.next;
        }
        BigInteger num = new BigInteger(str.toString());
        num=num.add(num);
        String numStr = num.toString();
        // String numStr = BigInteger.toString(n);
        int i =0;
        current = head;
        System.out.println(numStr);

        while(current!=null && i<numStr.length()){
            System.out.println(numStr.charAt(i)-'0');
            if(i==numStr.length()-2 && current.next == null){
                ListNode extra = new ListNode();
                extra.val = numStr.charAt(i) - '0';
                extra.next = null;
                current.next = extra;
            }else{
                current.val = numStr.charAt(i)-'0';
                current=current.next;
                i++;
            }
        }
        return head;
    }
}