package com.chenxd.algorithm.array.sparse;

public class SparseArray {
    /**
     * 创建稀疏数组步骤
     * 1 遍历二维数组获得有效数据个数 sum
     * 2 根据sum可以创建稀疏数组 sparseArr[sum+1][3] 列数固定为3
     * 3 将二维数组有效数据存入稀疏数组（稀疏数组第一行固定 二维数组总行数、总列数、有效值）
     */
    public static void main(String[] args) {
        // 五子棋 棋盘11*11 1表示黑子 2表示白子
        int[][] sparseArr = new int[11][11];
        sparseArr[1][2] = 1;
        sparseArr[2][3] = 2;
        for (int[] ints : sparseArr) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        toSparserArray(sparseArr);
    }

    public static int[][] toSparserArray(int[][] sparseArr) {
        int sum=0;
        for (int i = 0; i < sparseArr.length; i++) {
            for (int j = 0; j < sparseArr.length; j++) {
                if(sparseArr[i][j]!=0){
                    sum++;
                }
            }
        }
        return new int[0][0];
    }
}
