package com.example.muliplicationtable;

import java.util.Random;

public abstract class Model {

    public int num1;
    public int num2;

    Random random = new Random();

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public abstract void newRandomNums();

    public boolean checkAnswer(int ans) {
        if (ans == num1*num2) return true;
        return false;
    }


}
