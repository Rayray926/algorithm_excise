package com.company;
/**
 * 反转一个只有3位数的整数。
 * 样例
 * 样例 1:
 * 输入: number = 123
 * 输出: 321
 * 样例 2:
 * 输入: number = 900
 * 输出: 9
 * 注意事项
 * 你可以假设输入一定是一个只有三位数的整数，这个整数大于等于100，小于1000。
 */


public class ReverseNumbers {
    /**思路：
     * 1.将传入的int型数字转为字符串后转为char[]
     * 2.遍历数组，定义一个标位flag,用于判断结尾是否有连续的0。如果有连续0则flag为false,否则为true，把至加到字符串中
     * 3.字符串在转成int型打印输出
     * @param number 传入的数字
     */
    public static void reverseInteger(int number) {
        String num=String.valueOf(number);
        char[] chars = num.toCharArray();
        String str = "";
        //定义个flag用于判断尾部是否有连续的0
        boolean flag = false;
        for (int i = chars.length - 1; i >= 0; i--) {
            //如果尾部是不是是0 ，则不加至字符串中
            if ((chars[i] - '0') != 0 || flag) {
                flag = true;
                str += chars[i];
            }
        }
        System.out.println(Integer.parseInt(str));
    }
    public static void main(String[] args) {
        reverseInteger(190);
    }
}
