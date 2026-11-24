package com.example.muliplicationtable;

public class Controller {
    Model model;
    MainActivity view;

    public Controller(MainActivity activity){
        model = new KefelModel();
        view = activity;
    }

    public void setGamemode(Gamemode gamemode) {
        switch (gamemode) {
            case KEFEL:
                model = new KefelModel();
                break;
            case CHALLENGE:
                model = new ChallengeModel();
                break;
            case UP_TO_20:
                model = new Upto20Model();
                break;
        }

        model.newRandomNums();
        view.displayNums(model.getNum1(), model.getNum2());
    }

    public void checkAnswer(int ans) {
        if (model.checkAnswer(ans)) {
            view.correctAns();
        }
        else {
            view.wrongAns();
        }
    }





}
