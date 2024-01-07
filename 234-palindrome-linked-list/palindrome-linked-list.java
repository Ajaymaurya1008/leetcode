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
        ArrayList<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current!=null){
            list.add(current.val);
            current=current.next;
        }
        int start=0;
        int end=list.size()-1;
        for(int i=0;i<list.size();i++){
            if(list.get(start)!=list.get(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}