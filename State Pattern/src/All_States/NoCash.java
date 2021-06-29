package All_States;

import Context.ATM_Machine;

public class NoCash implements IState{

    private ATM_Machine machine;

    public NoCash(ATM_Machine atm){
        machine = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Sorry! There is no cash here now");
    }

    @Override
    public void ejectCard() {
        System.out.println("Try Later");
    }

    @Override
    public void insertPin(int PinEntered) {
        System.out.println("Sorry! There is no cash here now");
    }

    @Override
    public void reqCash(int cash) {
        System.out.println("Sorry! There is no cash here now");
    }
}