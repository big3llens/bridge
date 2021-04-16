package imp;

import interfeces.Computer;

public class OfficeComputer implements Computer {
    int numberOfCore;
    boolean isGaming;
    boolean isBoost;
    double coreFrequency;

    public OfficeComputer(int numberOfCore, boolean isGaming, boolean isBoost, double coreFrequency) {
        this.numberOfCore = numberOfCore;
        this.isGaming = isGaming;
        this.isBoost = isBoost;
        this.coreFrequency = coreFrequency;
    }

    @Override
    public boolean isGaming() {
        return isGaming;
    }

    @Override
    public boolean isBoost() {
        return false;
    }

    @Override
    public void overclocking() {
        System.out.println("Данная модель не поддерживает разгон");
    }

    @Override
    public int numberOfCores() {
        return numberOfCore;
    }

    @Override
    public void openMSOffice() {
        System.out.println("открываем Excel");
    }

    @Override
    public void startWitcher3() {
        System.out.println("...Запуск ведьмака в 10фпс и жуткими лагами...");
    }

    @Override
    public void start() {
        System.out.println("Запуск компьютера за 20 секунд");
    }
}
