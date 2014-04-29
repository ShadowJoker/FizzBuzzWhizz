/**
 * FizzBuzzWhizz.java
 * Created by Zhang Peng at 2014-4-29
 * @Copyright (c) 2013 USTB All Rights Reserved.
 */
package com.shadowjoker.fbw;

/**
 * ��Ϸ��,��Ҫ�㷨������ʵ��
 * 
 * @author Zhang Peng 2014-4-29
 */
public class FizzBuzzWhizz {
    /** �����������飬�ڹ��췽���г�ʼ�� */
    private int[] speicalnums;
    private static final String ECHO1 = "Fizz";
    private static final String ECHO2 = "Buzz";
    private static final String ECHO3 = "Whizz";

    /**
     * ͨ������������������ʼ����Ϸ��
     * 
     * @param speicalnums ������������
     * @author Zhang Peng 2014-4-29
     */
    public FizzBuzzWhizz(int[] speicalnums) {
        this.speicalnums = speicalnums;
        System.out.println("The game is ready to go! Oh,yeah!");
    }

    /**
     * ��ʼ��Ϸ
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
     * ���б����Ĵ�����
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
     * �ж��Ƿ������һ��������
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
