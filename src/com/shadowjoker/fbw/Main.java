/**
 * Main.java
 * Created by Zhang Peng at 2014-4-29
 * @Copyright (c) 2013 USTB All Rights Reserved.
 */
package com.shadowjoker.fbw;

/**
 * ������
 * 
 * @author Zhang Peng 2014-4-29
 */
public class Main {
    /**
     * ���������������
     * 
     * @param args
     * @author Zhang Peng 2014-4-29
     */
    public static void main(String[] args) {
        //���þ�̬������ȡ������������
        int nums[] = SpecialNumOper.getSpecialNums();
        //�����Ϸ���ʵ��
        FizzBuzzWhizz game = new FizzBuzzWhizz(nums);
        //����launch������ʼ��Ϸ
        game.launch();
    }

}
