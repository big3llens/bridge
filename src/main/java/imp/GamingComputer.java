package imp;

import interfeces.Computer;

public class GamingComputer implements Computer {
    int numberOfCore;
    boolean isGaming;
    boolean isBoost;
    double coreFrequency;

    public GamingComputer(int numberOfCore, boolean isGaming, boolean isBoost, double coreFrequency) {
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
        coreFrequency += 0.600;
    }

    @Override
    public int numberOfCores() {
        return numberOfCore;
    }

    @Override
    public void openMSOffice() {
        System.out.println("На данном ПК не установлены рабочие приложения((");
    }

    @Override
    public void startWitcher3() {
        if (!isBoost){
            overclocking();
        }
        System.out.println("Запуск ведьмака, частота ядер повысилась на 600 MHz и составляет " + coreFrequency + " MHz");
    }

    @Override
    public void start() {
        System.out.println("Запуск компьютера за 5 секунд");
    }
}
