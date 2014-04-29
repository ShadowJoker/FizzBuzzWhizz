/**
 * FizzBuzzWhizz.java
 * Created by Zhang Peng at 2014-4-29
 * @Copyright (c) 2013 USTB All Rights Reserved.
 */
package com.shadowjoker.fbw;

/**
 * 游戏类,主要算法在这里实现
 * 
 * @author Zhang Peng 2014-4-29
 */
public class FizzBuzzWhizz {
    /** 特殊数的数组，在构造方法中初始化 */
    private int[] speicalnums;
    private static final String ECHO1 = "Fizz";
    private static final String ECHO2 = "Buzz";
    private static final String ECHO3 = "Whizz";

    /**
     * 通过特殊数的数组来初始化游戏类
     * 
     * @param speicalnums 特殊数的数组
     * @author Zhang Peng 2014-4-29
     */
    public FizzBuzzWhizz(int[] speicalnums) {
        this.speicalnums = speicalnums;
        System.out.println("The game is ready to go! Oh,yeah!");
    }

    /**
     * 开始游戏
     * 
     * @author Zhang Peng 2014-4-29
     */
    public void launch() {
        System.out.println("Game start!!!");
        for (int index = 1; index <= 100; index++) {
            if (this.isContainFirstNum(index)) {
                System.out.println(index + ": " + ECHO1);
            } else {
                this.multipleOper(index);
            }
        }
    }

    /**
     * 进行倍数的处理方法
     * 
     * @param index
     * @author Zhang Peng 2014-4-29
     */
    private void multipleOper(int index) {
        String str = "";
        if (speicalnums[0] != 0 && index % speicalnums[0] == 0) {
            str = str + ECHO1;
        }
        if (speicalnums[1] != 0 && index % speicalnums[1] == 0) {
            str = str + ECHO2;
        }
        if (speicalnums[2] != 0 && index % speicalnums[2] == 0) {
            str = str + ECHO3;
        }
        if (str != "") {
            System.out.println(index + ": " + str);
        } else {
            System.out.println(index + ": " + index);
        }
    }

    /**
     * 判断是否包含第一个特殊数
     * 
     * @return
     * @author Zhang Peng 2014-4-29
     */
    private boolean isContainFirstNum(int i) {
        String firstSpecialNum = Integer.toString(speicalnums[0]);
        String index = Integer.toString(i);
        return index.contains(firstSpecialNum);
    }
}
