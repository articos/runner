package util;

import dto.Runner;

public class RunnerUtilImpl extends Runner implements RunnerUtil {


    @Override
    public void run(Runner runner, int kilometers) {

        if ((runner.getFatigue() - kilometers) <= 0) {
            System.out.printf("uz nemuzu bezet");
        } else {
            runner.setFatigue(runner.getFatigue() + kilometers);
        }

    }

    @Override
    public void sleep(Runner runner, int hours) {

        if ((runner.getFatigue() + hours) >= 20) {
            runner.setFatigue(20);
        } else {
            runner.setFatigue(runner.getFatigue() + hours);
        }

    }
}
