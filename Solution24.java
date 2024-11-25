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
class Solution24 {
    public ListNode swapPairs(ListNode head) {
        //考虑空值
        if(head == null || head.next == null){
            return head;
        }
        //正常取值，这里我们使用while循环求解
        ListNode dumpyNode = new ListNode(0);
        dumpyNode.next = head;
        ListNode temp = dumpyNode;
        // ListNode temp = dumpyNode; 这行代码并不会新创建一个 ListNode，
        // 而是让变量 temp 引用（或指向）已经存在的 dumpyNode。
        while (temp.next != null && temp.next.next != null) { 
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            //将链表向前移动
            temp = node1;
        }
        return  dumpyNode.next;
    }
    public static void main(String[] args) {
        // 创建链表 1 -> 2 -> 3 -> 4
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        // 打印原始链表
        System.out.print("Original list: ");
        printList(head);

        // 实例化Solution24类并调用swapPairs方法
        Solution24 solution = new Solution24();
        head = solution.swapPairs(head);

        // 打印交换后的链表
        System.out.print("Swapped list: ");
        printList(head);
    }

    // 辅助方法：打印链表
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println(); // 换行
    }
}