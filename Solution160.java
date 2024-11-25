/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //首先判断head A和head B是否都为空
        if(headA == null || headB == null){
            return null;
        }
        //正常情况，考虑双指针
        ListNode tempA = headA;
        ListNode tempB = headB;
        //
        while (tempA!=tempB) { 
            if(tempA!=null){
                tempA = tempA.next; 
            }else{
                tempA = headB;
            }
            if(tempB!=null){
                tempB = tempB.next;
            }else{
                tempB = headA;
            }
        }
        return tempA;
    }
}