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
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        ListNode point=head;
        for(int i=1;i<cnt/2+1;i++){
            point=point.next;
        }
        return point;
    }
}

