import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
}

// Main class containing partition logic and driver
public class Main {

    // Partition method
    public ListNode partitionList(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        ListNode leftTail = left;
        ListNode rightTail = right;

        while (head != null) {
            if (head.val < x) {
                leftTail.next = head;
                leftTail = leftTail.next;
            } else {
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;
        }

        leftTail.next = right.next;
        rightTail.next = null;
        return left.next;
    }

    // Print list in array format
    public void printList(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        System.out.println(arr);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main sol = new Main();

        String input = sc.nextLine().trim();
        input = input.substring(1, input.length() - 1);
        String[] parts = input.split(",");

        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        for (String s : parts) {
            cur.next = new ListNode(Integer.parseInt(s.trim()));
            cur = cur.next;
        }

        ListNode head = dummy.next;

        int x = sc.nextInt();

        ListNode part = sol.partitionList(head, x);

        sol.printList(part);

        sc.close();
    }
}
