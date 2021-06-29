package All_States;

import Context.ATM_Machine;

public class HasCard implements IState{

    private ATM_Machine machine;

    public HasCard(ATM_Machine atm){
        machine = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("You've already inserted card");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your Card is ejected");
        machine.setState_noCard();
    }

    @Override
    public void insertPin(int PinEntered) {
        if(PinEntered == 1234){
            System.out.println("Your Pin is correct");
            machine.setState_hasPin();
        }
        else{
            System.out.println("Please provide correct Pin");
        }
    }

    @Override
    public void reqCash(int cash) {
        System.out.println("You can't cash out without giving any pin, try again :)");
    }
}
