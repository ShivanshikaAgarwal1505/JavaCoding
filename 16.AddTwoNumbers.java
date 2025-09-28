import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val=val;}
}

public class Main{
    public ListNode addTwoNumbers(ListNode a, ListNode b){
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        
        int carry=0;
        while(a!=null || b!=null || carry!=0){
            int x=(a!=null)? a.val:0;
            int y=(b!=null)? b.val:0;
            
            int sum=carry+x+y;
            carry=sum/10;
            
            cur.next=new ListNode(sum%10);
            cur=cur.next;
            
            if(a!=null) {
                a=a.next;
            }
            if(b!=null) {
                b=b.next;
            }
        }
        
        return dummy.next;
    }
    
    public void printArray(ListNode head){
        List<Integer> arr= new ArrayList<>(); 
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }   
        System.out.println(arr);
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
        
        String input1=sc.nextLine().trim();
        input1=input1.substring(1, input1.length()-1);
        String[] part1=input1.split(",");
        
        ListNode l1=new ListNode();
        ListNode cur1=l1;
        
        for(String s:part1){
            cur1.next= new ListNode(Integer.parseInt(s.trim()));
            cur1=cur1.next;
        }
        
        l1=l1.next;
        
        String input2=sc.nextLine().trim();
        input2=input2.substring(1, input2.length()-1);
        String[] part2=input2.split(",");
        
        ListNode l2=new ListNode();
        ListNode cur2=l2;
        
        for(String s:part2){
            cur2.next= new ListNode(Integer.parseInt(s.trim()));
            cur2=cur2.next;
        }
        
        l2=l2.next;
        
        ListNode x=m.addTwoNumbers(l1, l2);
        m.printArray(x);
        sc.close();
    }
}