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
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return false;
        }
        if(head.next != null){
            return true;
        }
        boolean palindrome = false;
        int firstVal = head.val;
        int finalVal = -1;
        while(head.next != null){
            //System.out.println(head.val);
            if(head.next.val != head.val){
                palindrome = false;
            }
            else{
                palindrome = true;
            }
            head = head.next;
            finalVal = head.val;
        }
        if(firstVal != finalVal){
            palindrome = false;
        }
        else{
            palindrome = true;
        }
        return palindrome;
    }
}