/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.Scanner;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode result = new ListNode(-1);
        ListNode pre = result;
        
        int carry = 0;

        while (l1 != null || l2 != null) {
            int l1Num = l1 == null ? 0 : l1.val;
            int l2Num = l2 == null ? 0 : l2.val;
            
            int sum = l1Num + l2Num + carry;
            
            carry = sum / 10 % 10;
            
            pre.next = new ListNode(sum % 10);
            pre = pre.next;
            
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        
        if(carry > 0){
            pre.next = new ListNode(carry);
        }
        return result.next;
    }
}