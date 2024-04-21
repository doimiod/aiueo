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
    public boolean hasCycle(ListNode head) {

        if(head==null)
        return false;
        
        ListNode fast = head;
        ListNode slow = head;
        System.out.println("head = "+fast.val);

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            System.out.println("fast = "+fast.val);
            System.out.println("slow = "+slow.val);

            if(fast == slow){
                return true;
            }
        }

        return false;
    }

    // another ans
    // if(head==null)
    //     return false;
    //      ListNode slow= head;
    //     ListNode fast= head.next;
    //     while(fast!=slow){
    //     if(fast==null || fast.next==null)
    //         return false;
        
    //         fast=fast.next.next;
    //         slow= slow.next;
            
    //     }
    //     return true;


}