import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;
//import java.util.Scanner;

public class PracticLessons {

    public static class GUI implements ActionListener {

        int count = 0;
        private JPanel panel;
        private JFrame frame;
        private JLabel label;

        public GUI (){
            frame = new JFrame();
            JButton button = new JButton("Clic me");
            button.addActionListener(this);
            label = new JLabel("Number of clicks :0");


            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
            panel.setLayout(new GridLayout(0,1));
            panel.add(button);
            panel.add(label);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Our GUI");
            frame.pack();
            frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            label.setText("Numbers of clicks: " + count);
        }
    }

    public static void main(String[] args) {

        new GUI ();
    }
}
