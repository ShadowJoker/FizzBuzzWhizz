/**
 * Main.java
 * Created by Zhang Peng at 2014-4-29
 * @Copyright (c) 2013 USTB All Rights Reserved.
 */
package com.shadowjoker.fbw;

/**
 * 主程序
 * 
 * @author Zhang Peng 2014-4-29
 */
public class Main {
    /**
     * 主方法，程序入口
     * 
     * @param args
     * @author Zhang Peng 2014-4-29
     */
    public static void main(String[] args) {
        //调用静态方法获取特殊数的输入
        int nums[] = SpecialNumOper.getSpecialNums();
        //获得游戏类的实例
        FizzBuzzWhizz game = new FizzBuzzWhizz(nums);
        //调用launch方法开始游戏
        game.launch();
    }

}
