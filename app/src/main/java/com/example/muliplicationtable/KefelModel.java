package com.example.muliplicationtable;

public class KefelModel extends Model {

    @Override
    public void newRandomNums() {
        num1 = random.nextInt(9) + 1;
        num2 = random.nextInt(9) + 1;
    }
}
