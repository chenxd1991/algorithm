package com.chenxd.algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/21
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
public class ArrayTraining {
    /**
     * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
     * 请返回 nums 的动态和。
     * 示例 1：
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,6,10]
     * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
     */
//    public static int[] runningSum(int[] nums) {
//        int[] arr = new int[nums.length];
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            arr[i] = sum;
//        }
//        return arr;
//    }
//    public static int[] runningSum(int[] nums) {
//        for (int i = 1; i < nums.length; i++) {
//            nums[i] += nums[i - 1];
//        }
//        return nums;
//    }

    /**
     * 给你一个整数数组 nums 。
     * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
     * 返回好数对的数目。
     * 示例 1：
     * 输入：nums = [1,2,3,1,1,3]
     * 输出：4
     * 解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
     * 输入：nums = [1,1,1,1]
     * 输出：6
     * 解释：数组中的每组数字都是好数对
     */
//    public static int numIdenticalPairs(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    /**
     * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
     * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
     * 示例 1：
     * 输入：candies = [2,3,5,1,3], extraCandies = 3
     * 输出：[true,true,true,false,true]
     */
//    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//        int max = Integer.MIN_VALUE;
//        for (int candy : candies) {
//            max = Math.max(max, candy);
//        }
//        List<Boolean> list = new ArrayList<>();
//        for (int candy : candies) {
//            if (candy + extraCandies >= max) {
//                list.add(true);
//            } else {
//                list.add(false);
//            }
//        }
//        return list;
//    }

    /**
     * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
     * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
     * 示例 1： 0 2 4
     * 输入：nums = [2,5,1,3,4,7], n = 3
     * 输出：[2,3,5,4,1,7]
     * 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
     */
//    public static int[] shuffle(int[] nums, int n) {
//        int[] arr = new int[2 * n];
//        for (int i = 0; i < n; i++) {
//            arr[2 * i] = nums[i];
//            arr[2 * i + 1] = nums[n + i];
//        }
//        return arr;
//    }

    /**
     * 给你两个整数，n 和 start 。
     * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
     * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
     * 示例 1：
     * 输入：n = 5, start = 0
     * 输出：8
     * 解释：数组 nums 为 [0, 2, 4, 6, 8]，其中 (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8 。
     * "^" 为按位异或 XOR 运算符。
     */
//    public static int xorOperation(int n, int start) {
//        int res = start;
//        for (int i = 1; i < n; i++) {
//            res ^= start + 2 * i;
//        }
//        return res;
//    }

    /**
     * 给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
     * 目标数组 target 最初为空。
     * 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
     * 重复上一步，直到在 nums 和 index 中都没有要读取的元素。
     * 请你返回目标数组。
     * 题目保证数字插入位置总是存在。
     * 示例 1：
     * 输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
     * 输出：[0,4,1,3,2]
     * 解释：
     * nums       index     target
     * 0            0        [0]
     * 1            1        [0,1]
     * 2            2        [0,1,2]
     * 3            2        [0,1,3,2]
     * 4            1        [0,4,1,3,2]
     */
//    public int[] createTargetArray(int[] nums, int[] index) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            list.add(index[i], nums[i]);
//        }
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }

    /**
     * 给你一个以行程长度编码压缩的整数列表 nums 。
     * 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
     * 请你返回解压后的列表。
     * 示例：
     * 输入：nums = [1,2,3,4]
     * 输出：[2,4,4,4]
     * 解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
     * 第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
     * 最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]。
     */
//    public static int[] decompressRLElist(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length / 2; i++) {
//            for (int j = 0; j < nums[2 * i]; j++) {
//                list.add(nums[2 * i + 1]);
//            }
//        }
//        return list.parallelStream().mapToInt(Integer::intValue).toArray();
//    }

    /**
     *  n 名士兵站成一排。每个士兵都有一个 独一无二 的评分 rating 。
     * 每 3 个士兵可以组成一个作战单位，分组规则如下：
     * 从队伍中选出下标分别为 i、j、k 的 3 名士兵，他们的评分分别为 rating[i]、rating[j]、rating[k]
     * 作战单位需满足： rating[i] < rating[j] < rating[k] 或者 rating[i] > rating[j] > rating[k] ，其中  0 <= i < j < k < n
     * 请你返回按上述条件可以组建的作战单位数量。每个士兵都可以是多个作战单位的一部分。
     * 示例 1：
     * 输入：rating = [2,5,3,4,1]
     * 输出：3
     * 解释：我们可以组建三个作战单位 (2,3,4)、(5,4,1)、(5,3,1) 。
     * 示例 2：
     * 输入：rating = [2,1,3]
     * 输出：0
     * 解释：根据题目条件，我们无法组建作战单位。
     * 示例 3：
     * 输入：rating = [1,2,3,4]
     * 输出：4
     */
//    public static int numTeams(int[] rating) {
//
//    }

    /**
     * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
     * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
     * 以数组形式返回答案。
     * 示例 1：
     * 输入：nums = [8,1,2,2,3]
     * 输出：[4,0,1,1,3]
     * 输入：nums = [6,5,4,8]
     * 输出：[2,1,0,3]
     * 输入：nums = [7,7,7,7]
     * 输出：[0,0,0,0]
     */
//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] arr = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int num : nums) {
//                if (nums[i] > num) {
//                    count++;
//                }
//            }
//            arr[i] = count;
//        }
//        return arr;
//    }

    /**
     * 给你一个整数数组 nums，请你返回其中位数为偶数的数字的个数。
     * 示例 1：
     * 输入：nums = [12,345,2,6,7896]
     * 输出：2
     * 解释：
     * 12 是 2 位数字（位数为偶数） 
     * 345 是 3 位数字（位数为奇数）  
     * 2 是 1 位数字（位数为奇数） 
     * 6 是 1 位数字 位数为奇数） 
     * 7896 是 4 位数字（位数为偶数）  
     * 因此只有 12 和 7896 是位数为偶数的数字
     * 示例 2：
     * 输入：nums = [555,901,482,1771]
     * 输出：1
     * 解释：
     * 只有 1771 是位数为偶数的数字。
     * 100000
     */
//    public static int findNumbers(int[] nums) {
//        int count = 0;
//        for (int num : nums) {
//            if (String.valueOf(num).length() % 2 == 0) {
//                count++;
//            }
//        }
//        return count;
//    }

    /**
     * 幂集。编写一种方法，返回某集合的所有子集。集合中不包含重复的元素。
     * <p>
     * 说明：解集不能包含重复的子集。
     * <p>
     * 示例:
     * <p>
     * 输入： nums = [1,2,3]
     * 输出：
     * [
     * [3],
     *   [1],
     *   [2],
     *   [1,2,3],
     *   [1,3],
     *   [2,3],
     *   [1,2],
     *   []
     * ]
     */
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answers = new ArrayList<>();
        answers.add(new ArrayList<>());
        //当前元素
        for (int n : nums) {
            //原来元素的基础数
            int length = answers.size();
            for (int i = 0; i < length; i++) {
                //将原来的元素集合全部加入新集合中
                List<Integer> lists = new ArrayList<>(answers.get(i));
                //将当前元素加入到新集合中
                lists.add(n);
                //结果集
                answers.add(lists);
            }

        }
        return answers;
    }

    /**
     * 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
     * 请你计算并返回该式的最大值。
     * 示例 1：
     * 输入：nums = [3,4,5,2]
     * 输出：12
     * 解释：如果选择下标 i=1 和 j=2（下标从 0 开始），则可以获得最大值，(nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12 。
     * 示例 2：
     * 输入：nums = [1,5,4,5]
     * 输出：16
     * 解释：选择下标 i=1 和 j=3（下标从 0 开始），则可以获得最大值 (5-1)*(5-1) = 16 。
     * 示例 3：
     * 输入：nums = [3,7]
     * 输出：12
     */
//    public int maxProduct(int[] nums) {
//        Arrays.sort(nums);
//        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
//    }

    /**
     * 给定一个整数数组 a，其中1 ≤ a[i] ≤ n （n为数组长度）, 其中有些元素出现两次而其他元素出现一次。
     * 找到所有出现两次的元素。
     * 你可以不用到任何额外空间并在O(n)时间复杂度内解决这个问题吗？
     * 示例：
     * 输入:
     * [4,3,2,7,8,2,3,1]
     * 输出:
     * [2,3]
     */
//    public static List<Integer> findDuplicates(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            if(!set.add(num)){
//                list.add(num);
//            }
//        }
//        return list;
//    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));
                continue;
            }

            nums[index] = -nums[index];
        }

        return result;
    }

    /**
     * 数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
     * 注意：本题相对书上原题稍作改动
     * 示例 1：
     * 输入：[3,0,1]
     * 输出：2
     * 示例 2：
     * 输入：[9,6,4,2,3,5,7,0,1]
     * 输出：8
     */
    public static int missingNumber(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            a += nums[i];
            b += i;
        }
        b += nums.length;
        return b - a;
    }

    /**
     * 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。 
     * 请你统计并返回 grid 中 负数 的数目。
     * 示例 1：
     * 输入：grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
     * 输出：8
     * 解释：矩阵中共有 8 个负数。
     */
//    public static int countNegatives(int[][] grid) {
//
//    }

    /**
     * 给你一个字符串 s 和一个 长度相同 的整数数组 indices 。
     * 请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。
     * 返回重新排列后的字符串。
     * 输入：s = "codeleet", indices = [4,5,6,7,0,2,1,3]
     * 输出："leetcode"
     */
    public static String restoreString(String s, int[] indices) {
        char[] chars = s.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            newChars[indices[i]] = chars[i];
        }
        return String.valueOf(newChars);
    }

    /**
     * 给你一个数字数组 arr 。
     * 如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
     * 如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。
     * 示例 1：
     * 输入：arr = [3,5,1]
     * 输出：true
     * 解释：对数组重新排序得到 [1,3,5] 或者 [5,3,1] ，任意相邻两项的差分别为 2 或 -2 ，可以形成等差数列。
     */
    public static boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        Arrays.sort(arr);
        int con = arr[0] - arr[1];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != con) {
                return false;
            }
        }
        return true;
    }

    /**
     * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
     * 示例 1：
     * 输入：n = 5
     * 输出：[-7,-1,1,3,4]
     * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
     */
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n / 2; i++) {
            arr[i] = i + 1;
            arr[n - i - 1] = -arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(sumZero(0));
    }
}
