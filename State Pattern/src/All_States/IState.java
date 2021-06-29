package All_States;

public interface IState {
    void insertCard();

    void ejectCard();

    void insertPin(int PinEntered);

    void reqCash(int cash);
}
