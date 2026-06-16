package linkedlists;

public class removeNthNode {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode res=new ListNode(0,head);
            ListNode dummy=res;

            for (int i=0;i<n;i++){
                head=head.next;
            }
            while(head!=null){
                dummy=dummy.next;
                head=head.next;
            }

            dummy.next=dummy.next.next;

            return res.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution res = new Solution();
        ListNode newHead = res.removeNthFromEnd(head, 2);

        // printing the modified linked list
        ListNode temp = newHead;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    
}
