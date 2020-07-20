package com.chenxd.algorithm.linkedlist;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/20
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public void addAtTail(int val) {
        if (next == null) {
            next = new ListNode(val);
            return;
        }
        ListNode temp = next;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(val);
    }
}

class TestListNode {
    public static void main(String[] args) {
        ListNode node = new ListNode(0);
        node.addAtTail(1);
        node.addAtTail(2);
        node.addAtTail(3);
    }
}
