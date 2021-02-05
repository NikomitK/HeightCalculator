import javax.swing.*;

public class Message {

    public static void display(int height){
        JFrame frame = new JFrame();
        frame.setSize(200, 150);
        frame.setTitle("Result");
        frame.setVisible(true);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        JLabel label = new JLabel("Your height is: " + height + "cm!");
        label.setBounds(10, 50, 150, 15);
        label.setVisible(true);
        panel.add(label);

    }

}
