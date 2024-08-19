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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode=new ListNode(-1);
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode curr=dummyNode;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val)
            {
                ListNode nn=new ListNode(t1.val);
                curr.next=nn;
                curr=nn;
                t1=t1.next;
            }
            else{
                ListNode nn=new ListNode(t2.val);
                curr.next=nn;
                curr=nn;
                t2=t2.next;
            }            
            
            
        }

        while(t1!=null){
            ListNode nn=new ListNode(t1.val);
            curr.next=nn;
            curr=nn;
            t1=t1.next;
        }

        while(t2!=null){
            ListNode nn=new ListNode(t2.val);
            curr.next=nn;
            curr=nn;
            t2=t2.next;
        }
        return dummyNode.next;
    }
    
}