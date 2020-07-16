package com.company;

public class Patients {
    private int successfulHealing;
    private int seriouslyIll;
    private int dead;

    public Patients(int successfulHealing, int seriouslyIll, int dead){
        this.successfulHealing = successfulHealing;
        this.seriouslyIll = seriouslyIll;
        this.dead = dead;
    }

    public int getSuccessfulHealing(){
        return successfulHealing;
    }

    public int getSeriouslyIll() {
        return seriouslyIll;
    }

    public int getDead(){
        return dead;
    }
}
