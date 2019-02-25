package com.bjs.sort;

/**
 * @Descriptionb 选择排序.
 * @Author BianJiashuai
 */
public class SelectSort {

  public static void selectSort(int[] sortedArr) {
    int minIndex, temp; // 最小值的索引, 交换使用的临时变量
    for (int i = 0; i < sortedArr.length -1; i++) {
      minIndex = i; // 假设第一个元素为最小元素
      for (int j = i + 1; j < sortedArr.length; j++) {
        if (sortedArr[j] < sortedArr[minIndex]) { // 如果存在比假设元素更小的元素
          minIndex = j; //变更最小元素的索引
        }
      }

      // 无序区第一个元素和真正最小的元素进行交换
      temp = sortedArr[i];
      sortedArr[i] = sortedArr[minIndex];
      sortedArr[minIndex] = temp;
    }
  }

  public static void main(String[] args) {
    int[] sortedArr = Util.generateIntArray(20);
    System.out.println("排序前: " + Util.toString(sortedArr));
    selectSort(sortedArr);
    System.out.println("排序后: " + Util.toString(sortedArr));
  }
}
