

public class Solution92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // 设置dumpyNode 来解决
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        //先找到反转链表的初始位置
        for (int i = 0; i < left-1; i++) {
            pre = pre.next;
        }   
        //交换，将新读入的节点。
        //注意，因为每一次把新读入的节点next放到pre的后面，与pre.next交换位置，
        //因此我们需要使用pre.next来表示。
        ListNode cur = pre.next;
        ListNode next;
        for (int i = 0; i < right-left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummyNode.next;
    }
}
