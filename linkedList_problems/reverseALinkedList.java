package linkedList_problems;
public class reverseALinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) { this.val = val; }
    }

    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            ListNode next;

            while (curr != null) {
                next = curr.next; // establishing value of next
                curr.next = prev; // making the reversal link
                prev = curr; // moving prev to next pos
                curr = next; // moving ahead
            }
            return prev;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution res = new Solution();
        ListNode newHead = res.reverseList(head);

        // printing the reversed linked list
        ListNode temp = newHead;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
