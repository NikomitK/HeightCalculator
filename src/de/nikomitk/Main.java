package de.nikomitk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static JTextField height;
    private static Dings lul = new Dings();

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Height Calculator");
        frame.setSize(250, 150);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        JLabel text = new JLabel("Insert your height: ");
        text.setFont(new Font("Arial", Font.PLAIN, 16));
        text.setVisible(true);
        text.setBounds(15, 50, 200, 20);
        panel.add(text);
        height = new JTextField();
        height.setFont(new Font("Arial", Font.PLAIN, 16));
        height.setVisible(true);
        height.setBounds(145, 50, 60, 20);
        panel.add(height);
        JButton calc = new JButton("Calc");
        calc.setFont(new Font("Arial", Font.PLAIN, 16));
        calc.setVisible(true);
        calc.setBounds(170, 90, 70, 15);
        calc.addActionListener(lul);
        panel.add(calc);
        frame.pack();
        frame.setSize(280, 180);
        frame.setResizable(false);
    }


}
class Dings implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(Main.height.getText().length() > 0) {
                SystemTray tray = SystemTray.getSystemTray();
                TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().createImage("icon.png"), "Tray Demo");
                trayIcon.setImageAutoSize(true);
                trayIcon.setToolTip("System tray icon demo");
                tray.add(trayIcon);
                    trayIcon.displayMessage("YOUR HEIGHT WAS CALCULATED!!", "Your height is: " + Main.height.getText(), TrayIcon.MessageType.INFO);
                    JOptionPane.showMessageDialog(null, "Your height is: " + Main.height.getText());
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}