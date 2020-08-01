package com.chenxd.algorithm.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author create by xiaodong.chen
 * @create 2020/07/22
 * @email xiaodong.chen@huixiaoer.com
 * @description
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        this.val = x;
    }
}

class TestTree {

    private static List<Integer> list = new ArrayList<>();

    /**
     * 前序遍历
     *
     * @param node
     */
    public static List<Integer> preOrderTree(TreeNode node) {
        if (node == null) {
            return list;
        }
        list.add(node.val);
        preOrderTree(node.left);
        preOrderTree(node.right);
        return list;
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pollLast();
            list.add(treeNode.val);
            if (treeNode.right != null) {
                stack.add(treeNode.right);
            }
            if (treeNode.left != null) {
                stack.add(treeNode.left);
            }
        }
        return list;
    }

    /**
     * 中序遍历
     *
     * @param node
     */
    public static void inOrderTree(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTree(node.left);
        System.out.print(node.val + "\t");
        inOrderTree(node.right);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pollLast();
            if (treeNode.right != null) {
                stack.add(treeNode.right);
            }
            if (treeNode.left != null) {
                stack.add(treeNode.left);
            }
            list.add(treeNode.val);
        }
        return list;
    }

    /**
     * 后序遍历
     *
     * @param node
     */
    public static void postOrderTree(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTree(node.left);
        postOrderTree(node.right);
        System.out.print(node.val + "\t");
    }

    /**
     * 数的最大深度
     *
     * @param node
     * @return
     */
    public static int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        return left > right ? left + 1 : right + 1;
    }

    public static int nodeCount(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return nodeCount(node.left) + nodeCount(node.right) + 1;
    }

    public static int leafNodeCount(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return leafNodeCount(node.left) + leafNodeCount(node.right);
    }

    /**
     * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
     * 例如输入：
     *      4
     *    /   \
     *   2     7
     *  / \   / \
     * 1   3 6   9
     * 镜像输出：
     *      4
     *    /   \
     *   7     2
     *  / \   / \
     * 9   6 3   1
     * 示例 1：
     * 输入：root = [4,2,7,1,3,6,9]
     * 输出：[4,7,2,9,6,3,1]
     */
    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode(nums[(nums.length / 2)]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length));
        return root;
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }

    /**
     * 前：10 5 2 8 15 12 18
     * 中：2 5 8 10 12 15 18
     * 后：2 8 5 12 18 15 10
     *
     * @param args
     */
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);

        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(9);
        System.out.println(mirrorTree(treeNode));

    }
}
