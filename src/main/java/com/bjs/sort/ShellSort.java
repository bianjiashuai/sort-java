package com.bjs.sort;

/**
 * @Description 希尔排序(插入排序的改进版).
 * @Author BianJiashuai
 */
public class ShellSort {

  public static void shellSort(int[] sortedArr) {
    int h = 1; // 默认间隔
    int insertIndex, insertElement; //待插入的位置和待插入的元素
    while (h < sortedArr.length / 3) {
      h = 3 * h + 1;
    }
    while (h >= 1) {
      for (int i = h; i < sortedArr.length; i++) {
        insertIndex = i - h;
        insertElement = sortedArr[i];
        while (insertIndex >= 0 && sortedArr[insertIndex] > insertElement) {
          sortedArr[insertIndex + h] = sortedArr[insertIndex];
          insertIndex -= h;
        }
        sortedArr[insertIndex + h] = insertElement;
      }
      h = h / 3;
    }
  }

  public static void main(String[] args) {
    int[] sortedArr = Util.generateIntArray(20);
    System.out.println("排序前: " + Util.toString(sortedArr));
    shellSort(sortedArr);
    System.out.println("排序后: " + Util.toString(sortedArr));
  }
}
