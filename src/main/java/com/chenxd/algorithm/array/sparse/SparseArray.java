package com.chenxd.algorithm.array.sparse;

public class SparseArray {
    /**
     * 稀疏数组的前提是矩阵 n*m
     * 创建稀疏数组步骤
     * 1 遍历二维数组获得有效数据个数 sum
     * 2 根据sum可以创建稀疏数组 sparseArr[sum+1][3] 列数固定为3
     * 3 将二维数组有效数据存入稀疏数组（稀疏数组第一行固定 二维数组总行数、总列数、有效值）
     */
    public static void main(String[] args) {
        // 五子棋 棋盘11*11 1表示黑子 2表示白子
        int[][] arr = new int[11][11];
        arr[1][2] = 1;
        arr[2][3] = 2;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        int[][] sparseArr = toSparserArray(arr);
        int[][] newArr = toArray(sparseArr);
        System.out.println("==========================");
        for (int[] ints : newArr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] toSparserArray(int[][] arr) {
        // 第一步计算不同数据的个数
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    sum++;
                }
            }
        }
        // 第二步创建二维数组
        int[][] sparseArr = new int[sum + 1][3];
        // 第三部填充稀疏数组
        sparseArr[0][0] = arr.length;
        sparseArr[0][1] = arr[0].length;
        sparseArr[0][2] = sum;
        // 记录非0数据的行数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = arr[i][j];
                }
            }
        }
        return sparseArr;
    }

    public static int[][] toArray(int[][] sparseArr) {
        int[][] arr = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i < sparseArr.length; i++) {
            arr[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        return arr;
    }
}
