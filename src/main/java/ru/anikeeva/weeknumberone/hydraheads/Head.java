package ru.anikeeva.weeknumberone.hydraheads;

public class Head {
    private int eyesAmount;
    private int earsAmount;

    public void setEyesAmount(int eyesAmount) {
        this.eyesAmount = eyesAmount;
    }

    public void setEarsAmount(int earsAmount) {
        this.earsAmount = earsAmount;
    }

    public Head(int eyesAmount, int earsAmount) {
        this.eyesAmount = eyesAmount;
        this.earsAmount = earsAmount;
    }

    public int getEyesAmount() {
        return eyesAmount;
    }

    public int getEarsAmount() {
        return earsAmount;
    }
}
