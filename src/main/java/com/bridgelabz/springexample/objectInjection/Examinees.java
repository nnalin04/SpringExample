package com.bridgelabz.springexample.objectInjection;

public class Examinees {

    private Cheat cheat;

    public void setCheat(Cheat cheat) {
        this.cheat = cheat;
    }

    public void cheating() {
        this.cheat.cheat();
    }

}
