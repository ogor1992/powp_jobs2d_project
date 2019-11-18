package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFigureCommandOptionListener implements ActionListener {

    private DriverManager driverManager;
    private ComplexCommandFactory complexCommandFactory = new ComplexCommandFactory();

    public SelectFigureCommandOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Triangle"))
            complexCommandFactory.shape("shape1", driverManager.getCurrentDriver()).execute();
        else if (e.getActionCommand().equals("Square"))
            complexCommandFactory.shape("shape2", driverManager.getCurrentDriver()).execute();
    }
}
