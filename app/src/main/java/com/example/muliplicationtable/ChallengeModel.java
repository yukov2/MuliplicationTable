package com.example.muliplicationtable;

public class ChallengeModel extends Model {
    @Override
    public void newRandomNums() {
        num1 = random.nextInt(99) + 1;
        num2 = random.nextInt(99) + 1;
    }
}
