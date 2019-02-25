package com.bjs.sort;

import java.util.List;

/**
 * @Description 插入排序
 * @Author BianJiashuai
 */
public class InsertSort {

  public static void insertSort(int[] sortedArr) {
    int insertIndex, insertElement; // 待插入的位置和待插入的元素
    for (int i = 1; i < sortedArr.length; i++) {
      insertIndex = i - 1;
      insertElement = sortedArr[i];
      while (insertIndex >= 0 && sortedArr[insertIndex] > insertElement) {
        sortedArr[insertIndex + 1] = sortedArr[insertIndex]; // 后移一位
        insertIndex--; // 继续与前一个元素比较
      }
      sortedArr[insertIndex + 1] = insertElement;
    }
  }

  public static void main(String[] args) {
    int[] sortedArr = Util.generateIntArray(20);
    System.out.println("排序前: " + Util.toString(sortedArr));
    insertSort(sortedArr);
    System.out.println("排序后: " + Util.toString(sortedArr));
  }

}
