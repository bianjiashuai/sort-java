package com.bjs.sort;

import java.util.Random;

/**
 * @Description 工具类.
 * @Author BianJiashuai
 */
public class Util {

  public static final Integer INT_RANDOM_BOUND = 101;

  /**
   * 数组ToString格式化输出.
   * @param formatArr 需要被格式化打印的数组.
   * @return 格式化后的数组
   */
  public static String toString(int[] formatArr) {
    if (formatArr == null) {
      return "[]";
    }

    int len = formatArr.length;
    if (0 == len) {
      return  "[]";
    }

    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < len; i++) {
      sb.append(formatArr[i]);
      if (i != (len - 1)) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }

  /**
   * 随机生成指定长度的int类型数组
   * @param len 数组的长度
   * @return 生成后的数组
   */
  public static int[] generateIntArray(int len) {
    int[] arrayInt = new int[len];
    Random random = new Random();
    for (int i = 0; i < len; i++) {
      arrayInt[i] = random.nextInt(INT_RANDOM_BOUND);
    }
    return arrayInt;
  }
}
