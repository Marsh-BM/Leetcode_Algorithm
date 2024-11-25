public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dumpyHead = new ListNode(0);
        dumpyHead.next = head;
        ListNode fast = dumpyHead;
        ListNode slow = dumpyHead;
        // 先走n+1步
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        // 双指针
        while (fast != null) { 
            fast = fast.next;
            slow = slow.next;
        }
        //删除对应的节点
        slow.next = slow.next.next;
        return dumpyHead.next;
    }
}
