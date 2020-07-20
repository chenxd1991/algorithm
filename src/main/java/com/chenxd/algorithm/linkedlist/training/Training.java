package com.chenxd.algorithm.linkedlist.training;

import com.chenxd.algorithm.linkedlist.ListNode;

import java.util.HashSet;
import java.util.Stack;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/20
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
public class Training {
    /**
     * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。
     * 注意：本题相对原题稍作改动
     * 示例：
     * 输入： 1->2->3->4->5 和 k = 2
     * 输出： 4
     */
//    public static int kthToLast(ListNode head, int k) {
//        Stack<ListNode> stack = new Stack<>();
//        while (head != null) {
//            stack.add(head);
//            head = head.next;
//        }
//        ListNode node = null;
//        for (int i = 0; i < k; i++) {
//            node = stack.pop();
//        }
//        return node.val;
//    }
//    public static int kthToLast(ListNode head, int k) {
//        ListNode temp = head;
//        int size = 0;
//        while (temp != null) {
//            size++;
//            temp = temp.next;
//        }
//        for (int i = 0; i < size - k; i++) {
//            head = head.next;
//        }
//        return head.val;
//    }

    /**
     * 实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
     * 示例：
     * <p>
     * 输入：单向链表a->b->c->d->e->f中的节点c
     * 结果：不返回任何数据，但该链表变为a->b->d->e->f
     */
//    public static void deleteNode(ListNode node) {
//        node.val = node.next.val;
//        node.next = node.next.next;
//    }

    /**
     * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
     * <p>
     * 请你返回该链表所表示数字的 十进制值 。
     * 示例 1：
     * 输入：head = [1,0,1]
     * 输出：5
     * 解释：二进制数 (101) 转化为十进制数 (5)
     */
//    public static int getDecimalValue(ListNode head) {
//        ListNode temp = head;
//        int size = 0;
//        while (temp != null) {
//            temp = temp.next;
//            size++;
//        }
//        int num = 0;
//        while (head != null) {
//            num += Math.pow(2, size - 1) * head.val;
//            head = head.next;
//            size--;
//        }
//        return num;
//    }

    /**
     *输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
     * 示例：
     * 给定一个链表: 1->2->3->4->5, 和 k = 2.
     * 返回链表 4->5.
     */
//    public static ListNode getKthFromEnd(ListNode head, int k) {
//        ListNode temp = head;
//        Stack<ListNode> stack = new Stack<>();
//        while (temp != null) {
//            stack.add(temp);
//            temp = temp.next;
//        }
//        ListNode node = null;
//        for (int i = 0; i < k; i++) {
//            node = stack.pop();
//        }
//        return node;
//    }

    /**
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
     * 示例:
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     */
//    public static ListNode reverseList(ListNode head) {
//        ListNode pre = null;
//        ListNode cur = head;
//        ListNode tmp;
//        while (cur != null) {
//            tmp = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = tmp;
//        }
//        return pre;
//    }
    public static ListNode removeDuplicateNodes(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        while (head != null) {
            set.add(head.val);
            head = head.next;
        }
        ListNode node = null;

        return node;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.addAtTail(2);
        listNode.addAtTail(3);
        listNode.addAtTail(3);
        listNode.addAtTail(2);
        listNode.addAtTail(1);
        removeDuplicateNodes(listNode);
    }
}