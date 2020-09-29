package com.bridgelabz.springexample.objectInjection;

public class Examinees {

    private MathCheat mathCheat;

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void cheating() {
        this.mathCheat.mathCheat();
    }

}
