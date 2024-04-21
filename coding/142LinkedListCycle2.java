/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        // ListNode fast = head;
        // int ans = 0;

        // head = head.next.next.next.next.next.next;
        // System.out.println(head.val);
        
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode target = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                while (slow != target) {
                    slow = slow.next;
                    target = target.next;
                    System.out.println("slow is "+slow.val);
                    System.out.println("target is "+target.val);
                }
                return target;
            }
        }
        return null;
    }
}