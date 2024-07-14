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
        ListNode current = head;
        int index=0;
        int min=Integer.MAX_VALUE;
        int[] arr = {-1,-1};
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> criticalPoints = new ArrayList();
        while(current!=null){
            list.add(current.val);
            current=current.next;
        }
        if(list.size()<4) return arr;
        System.out.println(list);
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i-1)>list.get(i)&&list.get(i+1)>list.get(i) || list.get(i-1)<list.get(i)&&list.get(i+1)<list.get(i)){
                criticalPoints.add(i);
                if(index!=0){
                    min=Math.min(min,i-index);
                }
                index=i;
            }
        }
        if(criticalPoints.size()<2) return arr;
        arr[1]=criticalPoints.get(criticalPoints.size()-1)-criticalPoints.get(0);
        arr[0]=min;
        return arr;
    }

    public static int minMax(ArrayList<Integer> list){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                min=Math.min(min,list.get(j)-list.get(i));
            }
        }
        return min;
    }
}