package com.chenxd.algorithm.bit;

import com.chenxd.algorithm.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/24
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
public class BitManipulationClient {

    /**
     * 给你两个整数，n 和 start 。
     * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
     * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
     * 示例 1：
     * 输入：n = 5, start = 0
     * 输出：8
     * 解释：数组 nums 为 [0, 2, 4, 6, 8]，其中 (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8 。
     * "^" 为按位异或 XOR 运算符。
     * 示例 2：
     * 输入：n = 4, start = 3
     * 输出：8
     * 解释：数组 nums 为 [3, 5, 7, 9]，其中 (3 ^ 5 ^ 7 ^ 9) = 8.
     */
    public static int xorOperation(int n, int start) {
        int xor = start;
        for (int i = 1; i < n; i++) {
            xor ^= start + 2 * i;
        }
        return xor;
    }

    /**
     * 编写一个函数，不用临时变量，直接交换numbers = [a, b]中a与b的值。
     * 示例：
     * 输入: numbers = [1,2]
     * 输出: [2,1]
     * 原理： n^n=0 n^0=n
     */
    public static int[] swapNumbers(int[] numbers) {
        int a = numbers[0];
        int b = numbers[1];
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return new int[]{a, b};
    }

    /**
     * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
     * 示例 1：
     * 输入：num = 14
     * 输出：6
     * 解释：
     * 步骤 1) 14 是偶数，除以 2 得到 7 。
     * 步骤 2） 7 是奇数，减 1 得到 6 。
     * 步骤 3） 6 是偶数，除以 2 得到 3 。
     * 步骤 4） 3 是奇数，减 1 得到 2 。
     * 步骤 5） 2 是偶数，除以 2 得到 1 。
     * 步骤 6） 1 是奇数，减 1 得到 0 。
     * 原理：
     * num&1 == 0 为偶数 num&1==1 为奇数
     * num>>1 除以 2  num<<1 乘以2
     */
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 0) {
                num = num >> 1;
            } else {
                num -= 1;
            }
            count++;
        }
        return count;
    }

    /**
     * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
     * 请你返回该链表所表示数字的 十进制值 。
     * 示例 1：
     * 输入：head = [1,0,1]
     * 输出：5
     * 解释：二进制数 (101) 转化为十进制数 (5)
     */
    public static int getDecimalValue(ListNode head) {
        int num = 0;
        while (head != null) {
            num = (num << 1) ^ head.val;
            head = head.next;
        }
        return num;
    }

    public static int[] countBits(int num) {
        int[] arr = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            int temp = i;
            temp = temp - ((i >>> 1) & 0x55555555);
            temp = (temp & 0x33333333) + ((temp >>> 2) & 0x33333333);
            temp = (temp + (temp >>> 4)) & 0x0f0f0f0f;
            temp = temp + (temp >>> 8);
            temp = temp + (temp >>> 16);
            arr[i] = temp & 0x3f;
        }
        return arr;
    }

    /**
     * 给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
     * 示例 :
     * 输入: [1,2,1,3,2,5]
     * 输出: [3,5]
     */
    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 说明：
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     * 示例 1:
     * 输入: [2,2,1]
     * 输出: 1
     */
    public static int singleNumber1(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(2^2^1);
        System.out.println(singleNumber1(new int[]{2, 2, 1}));
    }
}
