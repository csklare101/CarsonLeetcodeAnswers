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
import java.math.BigInteger; 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder l1s = new StringBuilder();
        StringBuilder l2s = new StringBuilder();
        
        while(l1.next != null){
            l1s.append(l1.val);
            l1 = l1.next;
        }
        l1s.append(l1.val);
        l1s = l1s.reverse();
        
        
        while(l2.next != null){
            l2s.append(l2.val);
            l2 = l2.next;
        }
        l2s.append(l2.val);
        l2s = l2s.reverse();
        
        
       
        StringBuilder l3s = new StringBuilder();
        BigInteger b1 = new BigInteger(l1s.toString());
        BigInteger b2 = new BigInteger(l2s.toString());
        BigInteger b3 = b1.add(b2);
        l3s.append(b3);
        l3s = l3s.reverse();

        ListNode l3 = null;
        ListNode temp = null;
        for(int i = 0; i < l3s.toString().length(); i++){
            if(i == 0){
                l3 = temp = new ListNode(Integer.parseInt(l3s.toString().substring(i,i+1)));
            }
            else{
                temp.next = new ListNode(Integer.parseInt(l3s.toString().substring(i,i+1)));
                temp = temp.next;
            }
        }
        
        
        return l3;
    }
}