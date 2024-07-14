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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode current = head.next;
        ListNode prev=head;
        ListNode next=head.next.next;
        int criticalPoints=0;
        int size=0;
        int min=Integer.MAX_VALUE;
        int firstCriticalPoint=-1;
        int lastCriticalPoint=-1;
        int prevCriticalPoint=-1;;
        int[] arr = {-1,-1};
        while(next!=null){
            if((current.val>prev.val && current.val>next.val) || (current.val<prev.val && current.val<next.val)){
                System.out.println(size);
                if(prevCriticalPoint!=-1){
                    min=Math.min(min,size-prevCriticalPoint);
                }else{
                    firstCriticalPoint=size;
                }
                prevCriticalPoint=size;
                criticalPoints++;
            }
            current=current.next;
            prev=prev.next;
            next=next.next;
            size++;
            if(next==null){
                lastCriticalPoint=prevCriticalPoint;
            }
        }
        System.out.println("first"+firstCriticalPoint);
        System.out.println("last"+lastCriticalPoint);
        if(criticalPoints<2) return arr;
        if(size<2) return arr;
        arr[0] = min;
        arr[1] = lastCriticalPoint-firstCriticalPoint;
        return arr;
    }
}