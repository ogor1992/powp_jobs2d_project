package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    private int X = 0, Y = 0;
    private Job2dDriver driver;

    public void OperateToCommand(int x, int y, Job2dDriver job2dDriver){
        this.X = x;
        this.Y = y;
        this.driver = job2dDriver;
    };

    @Override
    public void execute() {
        driver.operateTo(X, Y);
    }


}

