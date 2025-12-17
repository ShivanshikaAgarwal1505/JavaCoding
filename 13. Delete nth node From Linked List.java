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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) head=null;
        ListNode temp=head, del=head;
        int x=0;
        while(temp!=null){
            x++;
            temp=temp.next;
        }
        if(n==x) return head.next;
        for (int i=1; i<x-n; i++){
            del=del.next;
        }
        del.next=del.next.next;
        return head;
    }
}