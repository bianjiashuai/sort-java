package com.bjs.sort;

/**
 * @Description 堆排序
 * @Author BianJiashuai
 */
public class HeapSort {

  public static void heapSort(int[] sortedArr) {
    int len = sortedArr.length;
    for (int k = (len - 1) / 2; k >= 0; k--) { //for循环用来构造堆，最终生成最大堆
      sink(sortedArr, k, len);
    }
    while (len > 1) { //循环排序无序区
      swap(sortedArr, 1, len--); //堆顶a[1]与堆的最后一个元素a[N]交换位置，并且去掉最后一个元素到有序区，减小新堆
      sink(sortedArr, 1, len); //重新生成为最大堆
    }
  }

  /**
   * 从上至下堆有序化
   */
  private static void sink(int[] sortedArr, int k, int len) {
    while (2 * k <= len) {
      int j = 2 * k;
      if (j < len && sortedArr[j] < sortedArr[j + 1]) {
        //j<n保证j+1不越界，a[j]和a[j+1]是a[k]的左右子节点，这里是为了选取两个子节点较大的一个，a[j]大取a[j],a[j]小取a[j++]>= a[j])
        // 如果父节点大于等于值大的子节点，堆有序，终止循环
        break;
      }
      if (sortedArr[k] >= sortedArr[j]) { //如果父节点大于等于值大的子节点，堆有序，终止循环
        break;
      }
      swap(sortedArr, k, j); //交换值大的子节点和父节点的值，达到堆有序
      k = j; //子节点，作为下一个循环的父节点，继续下沉
    }
  }

  /**
   * 交换两个元素
   */
  private static void swap(int[] sortedArr, int i, int j) {
    int temp = sortedArr[i];
    sortedArr[i] = sortedArr[j];
    sortedArr[j] = temp;
  }//保证j+1不越界，a[j]和a[j+1]是a[k]的左右子节点，这里是为了选取两个子节点较大的一个，a[j]大取a[j],a[j]小取a[j++]


  public static void main(String[] args) {
    int[] sortedArr = Util.generateIntArray(20);
    System.out.println("排序前: " + Util.toString(sortedArr));
    heapSort(sortedArr);
    System.out.println("排序后: " + Util.toString(sortedArr));
  }
}
