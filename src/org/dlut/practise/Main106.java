package org.dlut.practise;

import org.dlut.practise.util.ListNode;

/**
 * @author wuyuhan
 * @date 2023/5/11 20:44
 */
class Solution {
    /**
     1. 递归版本
     */
    public ListNode reverseList(ListNode head) {
        // base
        if (head == null || head.next == null) {
            return head;
        }
        // 相信他能反转链表，并返回新的表头
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    /**
     * 2. 采用三指针反转链表
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        ListNode pre, curr, nxt;
        pre = null; curr = head; nxt = head;
        while (curr != null) {
            // 移动next指针
            nxt = curr.next;
            // 确定当前节点的下一个节点
            curr.next = pre;
            // 更新后移动pre
            pre = curr;
            // 再移动curr
            curr = nxt;
        }
        return pre;
    }

}