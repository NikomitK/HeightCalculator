import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static JTextField height;
    private static Dings lul = new Dings();

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Height Calculator");
        frame.setSize(250, 150);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        panel.setVisible(true);
        JLabel text = new JLabel("Insert your height: ");
        text.setVisible(true);
        text.setBounds(15, 50, 200, 15);
        panel.add(text);
        height = new JTextField();
        height.setVisible(true);
        height.setBounds(135, 50, 50, 15);
        panel.add(height);
        JButton calc = new JButton("Calc");
        calc.setVisible(true);
        calc.setBounds(160, 80, 70, 15);
        calc.addActionListener(lul);
        panel.add(calc);
    }


}
class Dings implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(Integer.parseInt(Main.height.getText()) >= 100) Message.display(Integer.parseInt(Main.height.getText()));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}