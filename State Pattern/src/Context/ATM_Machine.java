package Context;

import All_States.*;

public class ATM_Machine {
    private IState hasCard;
    private IState noCard;
    private IState hasPin;
    private IState noCash;

    public IState currentState;
    private int currentMoney;

    public ATM_Machine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasPin = new HasPin(this);
        this.noCash = new NoCash(this);

        this.currentState = noCard;
        this.currentMoney = 6000;
    }

    //state inter-change
    public void setState_noCard() {
        currentState = noCard;
    }

    public void setState_hasCard() {
        currentState = hasCard;
    }

    public void setState_hasPin() {
        currentState = hasPin;
    }

    public void setState_noCash() {
        currentState = noCash;
    }

    public int getMoney() {
        return currentMoney;
    }

    public void setMoney(int amount) {
        currentMoney = amount;
    }
    //state inter-change

}
