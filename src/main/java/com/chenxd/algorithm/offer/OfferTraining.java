package com.chenxd.algorithm.offer;

import com.chenxd.algorithm.linkedlist.ListNode;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/25
 * @email xiaodong.chen@huixiaoer.com
 * @description leetcode 剑指offer习题练习
 */
public class OfferTraining {

    /**
     * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     * 示例 1：
     * 输入: n = 3
     * 输出: 6
     */
    public static int sumNums(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNums(n - 1);
    }

    /**
     * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
     * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
     * 示例 1：
     * 输入: s = "abcdefg", k = 2
     * 输出: "cdefgab"
     */
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

    /**
     * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
     * 示例 1：
     * 输入：nums = [3,4,3,3]
     * 输出：4
     * 示例 2：
     * 输入：nums = [9,1,7,9,7,9,7]
     * 输出：1
     */
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return nums[0];
    }

    /**
     * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
     * 示例：
     * 给定一个链表: 1->2->3->4->5, 和 k = 2.
     * 返回链表 4->5.
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (k > 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
     * 示例 1:
     * 输入: n = 1
     * 输出: [1,2,3,4,5,6,7,8,9]
     */
    public static int[] printNumbers(int n) {
        int max = (int) Math.pow(10, n) - 1;
        int[] arr = new int[max];
        for (int i = 0; i < max; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     * 示例 1：
     * 输入：s = "We are happy."
     * 输出："We%20are%20happy."
     */
//    public static String replaceSpace(String s) {
//        return s.replace(" ","%20");
//    }
    public static String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == ' ') {
                sb.append("%20");
            } else {
                sb.append(aChar);
            }
        }
        return sb.toString();
    }

    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     * 示例 1：
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     */
    public static int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int size = stack.size();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }

    /**
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
     * 示例:
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        ListNode temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    /**
     * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
     * 示例1：
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     */
//    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        LinkedList<Integer> list = new LinkedList<>();
//        while (l1 != null) {
//            list.add(l1.val);
//            l1 = l1.next;
//        }
//        while (l2 != null) {
//            list.add(l2.val);
//            l2 = l2.next;
//        }
//        Collections.sort(list);
//        ListNode listNode = null;
//        for (Integer integer : list) {
//            if (listNode == null) {
//                listNode = new ListNode(integer);
//                continue;
//            }
//            ListNode temp = listNode;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = new ListNode(integer);
//        }
//        return listNode;
//    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        LinkedList<Integer> list = new LinkedList<>();
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                list.add(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                list.add(l2.val);
                l2 = l2.next;
            }

        }
        Collections.sort(list);
        ListNode listNode = null;
        for (Integer integer : list) {
            if (listNode == null) {
                listNode = new ListNode(integer);
                continue;
            }
            ListNode temp = listNode;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(integer);
        }
        return listNode;
    }

    /**
     * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
     * 示例 1：
     * 输入：nums = [4,1,4,6]
     * 输出：[1,6] 或 [6,1]
     * 示例 2：
     * 输入：nums = [1,2,10,4,1,4,3,3]
     * 输出：[2,10] 或 [10,2]
     */
    public static int[] singleNumbers(int[] nums) {
        int[] arr = new int[2];

        return arr;
    }
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
    }
}
