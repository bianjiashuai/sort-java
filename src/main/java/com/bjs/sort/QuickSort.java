package com.bjs.sort;

/**
 * @Description 快速排序
 * @Author BianJiashuai
 */
public class QuickSort {

  public static void quickSort(int[] sortedArr) {
    sort(sortedArr, 0, sortedArr.length - 1);
  }

  /**
   * 递归进行快速排序
   */
  private static void sort(int[] sortedArr, int left, int right) {
    if (right <= left) { //排序从左到右，确保右边比左边大
      return;
    }
    int j = partition(sortedArr, left, right); //切分
    sort(sortedArr, left, j - 1); //将左半边排序
    sort(sortedArr, j + 1, right); //将右半边排序
  }

  /**
   * 快速排序切分
   */
  private static int partition(int[] sortedArr, int left, int right) {
    int i = left, j = right + 1; //左右扫描指针
    int v = sortedArr[left]; //选取切分元素，这里选第一个，实际数据可以自行挑选
    while (true) {
      while (sortedArr[++i] < v) { //a[i]<v时增大i，只要比v小继续往右扫描 i="=" v="">< a[--j]){ //a[j]>v时减小j，只要比v大继续往左扫描
        if (j == left) { //扫描到左边则终止
          break;
        }
      }
      while (v < sortedArr[--j]) { //a[j]>v时减小j，只要比v大继续往左扫描
        if (j == left) { //扫描到左边则终止
          break;
        }
      }
      if (i >= j) { //如果左右指针交叉，终止循环
        break;
      }
      swap(sortedArr, i, j); //不满足上述条件（左边比v大，右边比v小，指针未交叉），左右元素交换位置
    }
    swap(sortedArr, left, j); //将切分元素v放入正确的位置
    return j; //a[left..j-1]<=a[j]<=a[j+1..right]，并返回j
  }

  /**
   * 交换两个元素
   */
  private static void swap(int[] sortedArr, int i, int j) {
    int temp = sortedArr[i];
    sortedArr[i] = sortedArr[j];
    sortedArr[j] = temp;
  }

  public static void main(String[] args) {
    int[] sortedArr = Util.generateIntArray(20);
    System.out.println("排序前: " + Util.toString(sortedArr));
    quickSort(sortedArr);
    System.out.println("排序后: " + Util.toString(sortedArr));
  }
}
