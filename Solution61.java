



public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        // head is none or just one node
        if(head==null || head.next == null){
            return head;
        }

        // connect the head and tail, create a cycle, and find a correct position cut this cycyle.
        ListNode cur = head;
        int length = 1;
        while (true) {
            length++;
            cur = cur.next;
            if(cur.next==null){
                cur.next = head;
                break;
            }
        }
        // 计算k对length的余数，找到新的尾节点
        k = k % length;
        // if (k != 0) { // 如果k为0，则不需要旋转

        // }
        for (int i = 0; i < length - k; i++) {
            cur = cur.next;
        }
        // 切断链表，形成新的链表
        ListNode newHead = cur.next;
        cur.next = null;

        return newHead;
    }
}
