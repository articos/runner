package com.company;

import dto.Runner;
import util.RunnerUtil;
import util.RunnerUtilImpl;

public class Main {

    public static void main(String[] args) {

        RunnerUtilImpl runner = new RunnerUtilImpl();

        runner.run(runner,19);
        runner.sleep(runner, 20);
        runner.run(runner,19);
        runner.run(runner,20);


    }


}
