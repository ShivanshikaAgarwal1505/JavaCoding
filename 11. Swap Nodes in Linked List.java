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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head, second=head;
        for(int i=1; i<k; i++){
            temp=temp.next;
        }

        ListNode first=temp;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
            second=second.next;
        }
        int x=first.val;
        first.val=second.val;
        second.val=x;

        return head;
    }
}