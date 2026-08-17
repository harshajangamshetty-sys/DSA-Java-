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
        
        ListNode dummy = new ListNode (0 , head);
        ListNode first = dummy;

        while(true) {
            ListNode kth = getK(first , k);
            if(kth == null) {
                break;
            }
                ListNode nextgrp = kth.next;
            
            ListNode cur = first.next;
            ListNode prev = kth.next;

            while(cur != nextgrp) {
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }

            ListNode temp = first.next;
            first.next = kth;
            first = temp;
        }
        return dummy.next;
    }

        public ListNode getK(ListNode checker , int k) {
            int count = 0;
            while(checker != null && count < k) {
                checker = checker.next;
                count ++;
            }
            return checker;
        }
}