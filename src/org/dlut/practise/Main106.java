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

}