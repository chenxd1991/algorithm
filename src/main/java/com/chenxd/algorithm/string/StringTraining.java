package com.chenxd.algorithm.string;

/**
 * @author create by xiaodong.chen
 * @create 2020/08/01
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
public class StringTraining {

    public static String removeOuterParentheses(String S) {
        return S.replace("()", "+").replace("(", "").replace(")", "").replace("+", "()");
    }

    public static boolean judgeCircle(String moves) {
        int step1 = 0;
        int step2 = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'R') {
                step1++;
            } else if (c == 'L') {
                step1--;
            } else if (c == 'U') {
                step2++;
            } else if (c == 'D') {
                step2--;
            }
        }
        return step1 == 0 && step2 == 0;
    }

    /**
     * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
     * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
     * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
     * 返回映射之后形成的新字符串。
     * 题目数据保证映射始终唯一。
     * 示例 1：
     * 输入：s = "10#11#12"
     * 输出："jkab"
     * 解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
     */
//    public static String freqAlphabets(String s) {
//
//    }
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
    }
}
