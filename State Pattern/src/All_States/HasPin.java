package All_States;

import Context.ATM_Machine;

public class HasPin implements IState{

    private ATM_Machine machine;

    public HasPin(ATM_Machine atm){
        machine = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("You already have a card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected!");
        machine.setState_noCard();
    }

    @Override
    public void insertPin(int PinEntered) {
        System.out.println("You already have provided pin!");
    }

    @Override
    public void reqCash(int cash) {

        int machineMoney = machine.getMoney();
        if(machineMoney < cash) {
            System.out.println("We don't have the amount. Please select less :)");
        }

        else {
            System.out.println(cash + " TK withdrowed.");
            int moneyLeft = machineMoney - cash;

            if(moneyLeft == 0){
                machine.setState_noCash();
                System.out.println("Your card is ejected!");
            }
            else {
                ejectCard();
            }

            machine.setMoney(moneyLeft);
        }
    }
}
