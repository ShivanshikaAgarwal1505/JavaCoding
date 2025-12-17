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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode temp=head;
        ListNode dummy= new ListNode(0, head);
        ListNode temp2=dummy;
        while(temp!=null){
            boolean dup=false;
            
            while(temp.next!=null && temp.val==temp.next.val){
                temp=temp.next;
                dup=true;
            }
            if(dup){
                temp2.next=temp.next;
            }
            else{
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}