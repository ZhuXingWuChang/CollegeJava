package corejava1.chapter6.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * Java核心技术6-3.
 */
public class TimeTester
{
    public static void main(String[] args)
    {
        var listener = new TimerPrinter();
        
        // construct a timer that calls the listener once every second
        var timer = new Timer(1000, listener);
        timer.start();
        
        // keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimerPrinter implements ActionListener
{
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone, the time is"
                + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
