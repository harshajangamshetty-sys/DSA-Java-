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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode checker = head;
        int count = 0;

        while(count < k) {
            if(checker == null) {
                return head;
            }

            checker = checker.next;
            count ++;
        }
        ListNode groupEnd = checker;

        ListNode newNode = reverseList(head , groupEnd);
        head.next = reverseKGroup(groupEnd , k);

        return newNode;
    }

       public ListNode  reverseList(ListNode head , ListNode groupEnd) {
        ListNode cur = head;
        ListNode prev = null;

        while(cur != groupEnd) {
           ListNode temp = cur.next;
           cur.next = prev;
           prev = cur;
           cur = temp;
        }
        return prev;
       }
}
    
