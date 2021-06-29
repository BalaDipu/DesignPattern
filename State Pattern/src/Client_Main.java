import Context.ATM_Machine;

public class Client_Main {
    public static void main(String[] args) {
        ATM_Machine atm = new ATM_Machine();

        atm.currentState.insertCard();
        atm.currentState.ejectCard();

        atm.currentState.insertCard();
        atm.currentState.insertPin(1234);
        atm.currentState.reqCash(5000);
    }
}