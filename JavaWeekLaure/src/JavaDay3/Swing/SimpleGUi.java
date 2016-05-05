package JavaDay3.Swing;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Created by student on 5/5/2016.
 */
public class SimpleGUi implements ActionListener {

   static  JFrame frame = new JFrame(" mMy first Application");
   static JButton button = new JButton("Click Me");

    public static void main ( String [] arg)
    {

        SimpleGUi gui = new SimpleGUi();
        gui.go();


    }
    public void go() {

        frame.getContentPane().add(button);

        frame.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);


        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event){
        button.setText("You click me");

    }
}

