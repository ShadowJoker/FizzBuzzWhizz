/**
 * SpecialNumOper.java
 * Created by Zhang Peng at 2014-4-29
 * @Copyright (c) 2013 USTB All Rights Reserved.
 */
package com.shadowjoker.fbw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 获取特殊数的操作类
 * 
 * @author Zhang Peng 2014-4-29
 */
public class SpecialNumOper {

    static int nums[] = { 10, 10, 10 };

    /**
     * 获取特殊数的静态方法
     * 
     * @return
     * @author Zhang Peng 2014-4-29
     */
    public static int[] getSpecialNums() {
        System.out.println("Please enter the first special number:");
        nums[0] = getNumber();
        System.out.println("Please enter the second special number:");
        nums[1] = getNumber();
        System.out.println("Please enter the last special number:");
        nums[2] = getNumber();
        System.out.println("The speical numbers are: " + nums[0] + "," + nums[1] + "," + nums[2]);
        return nums;
    }

    /**
     * 获取单个特殊数的输入
     * 
     * @return
     * @author Zhang Peng 2014-4-29
     */
    public static int getNumber() {
        boolean flag = false;
        int i = 0;
        while (!flag) {
            try {
                Scanner in = new Scanner(System.in);
                i = in.nextInt();
                if (i >= 10 || i < 0) {
                    System.out.println("The number must be 0-9, please try again:");
                    flag = false;
                } else if (nums[0] == i || nums[1] == i || nums[2] == i) {
                    System.out.println("Can not input same number twice, please try again:");
                    flag = false;
                } else {
                    flag = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Bad input, please try again:");
            }
        }
        return i;
    }
    
    private static String getNumsString(){
        return nums[0] + "," + nums[1] + "," + nums[2];
    }
}
