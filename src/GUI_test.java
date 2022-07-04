import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// provides a way to create new graph pop-ups
public class GUI_test extends JFrame implements ActionListener {

    private JFrame frame;
    private JLabel  title;


    public GUI_test(int width, int height) {
        frame = new JFrame("userPass");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0, 1780, 830);
        frame.setLayout(null);
        title = new JLabel ("Computer Science Questions");
        title.setBounds(50, 50, 400, 40);
        frame.getContentPane().add(title);


        frame.setVisible(true);
        System.out.println("GUI ready");

    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}