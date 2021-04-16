package imp;

import interfeces.Computer;
import interfeces.Keyboard;

public class SimpleKeyboard implements Keyboard {
    Computer computer;

    public SimpleKeyboard(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void start() {
        computer.start();
    }

    @Override
    public void startWork() {
        computer.openMSOffice();
    }

    @Override
    public void startGame() {
        computer.startWitcher3();
    }
}
