package com.bjs.sort;

/**
 * @Description 冒泡排序.
 * @Author BianJiashuai
 */
public class BubbleSort {
  public static void bubbleSort(int[] sortedArr) {
    int temp; // 用户交换的临时变量
    for (int i = 0; i < sortedArr.length - 1; i++) {
      for (int j = 0; j < sortedArr.length - 1 - i; j++) {
        if (sortedArr[j] > sortedArr[j + 1]) {
          temp = sortedArr[j];
          sortedArr[j] = sortedArr[j + 1];
          sortedArr[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] sortedArr = Util.generateIntArray(20);
    System.out.println("排序前: " + Util.toString(sortedArr));
    bubbleSort(sortedArr);
    System.out.println("排序后: " + Util.toString(sortedArr));
  }
}
