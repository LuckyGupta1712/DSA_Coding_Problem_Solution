package linkedlists;

public class mergeTwoSortedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) { this.val = val; }
    }
    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(-1);//helps in returning head at the end
            ListNode current = dummy;
            ListNode temp1=list1;
            ListNode temp2=list2;
            while (temp1 != null && temp2 != null) {
                if (temp1.val <= temp2.val) {
                    current.next = temp1; // Connect node from list 1
                    temp1 = temp1.next;   // Move list 1 pointer
                } else {
                    current.next = temp2; // Connect node from list 2
                    temp2 = temp2.next;   // Move list 2 pointer
                }
                current = current.next;   // Move construction pointer forward
            }
            if (temp1 != null) {//only elements of list1 left
                current.next = temp1;
            } else if (temp2 != null) {//only elements of list2 left
                current.next = temp2;
            }
            return dummy.next;//points to head
        }
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Solution res = new Solution();
        ListNode mergedHead = res.mergeTwoLists(list1, list2);

        // printing the merged linked list
        ListNode temp = mergedHead;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

