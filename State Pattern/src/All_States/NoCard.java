package All_States;

import Context.ATM_Machine;

public class NoCard implements IState{

    private ATM_Machine machine;


    public NoCard(ATM_Machine atm){
        machine = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Your card is inserted :>)");
        machine.setState_hasCard();
    }

    @Override
    public void ejectCard() {
        System.out.println("You have no card to eject!");
    }

    @Override
    public void insertPin(int PinEntered) {
        System.out.println("Please provide a card and then inset pin");
    }

    @Override
    public void reqCash(int cash) {
        System.out.println("Sorry! Follow the procedure to cash out");
    }
}
