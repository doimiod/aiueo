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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int plusOne = 0;
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;

        while(l1 != null || l2 != null || plusOne == 1){
            
            int sum = 0;

            if(l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }

            sum = sum + plusOne;
            
            // System.out.println(sum % 10);
            plusOne = sum / 10;

            result.next = new ListNode (sum % 10);
            result = result.next;

        }

        System.out.println(dummy.next.val);
        // System.out.println(dummy.next.val);
        
        return dummy.next;

    }
}