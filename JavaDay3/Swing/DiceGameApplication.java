package JavaDay3.Swing;

/**
 * Created by student on 5/5/2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceGameApplication extends JFrame implements ActionListener {
    public static void main ( String [] arg) {
        new DiceGameApplication();

    }
    JFrame frame = new JFrame("One Player Dice Game");
    JButton button = new JButton("Roll the dice");
    JTextField textField = new JTextField();
    JLabel label = new JLabel(" Enter your bet:");
    DiceGame dice = new DiceGame();


        public DiceGameApplication()


        {

            setSize(300, 200);
            //setLayout(new FlowLayout());

            // to close application when clicking on x
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //position of the window when opening (middle due to null value)
            setLocationRelativeTo(null);

            getContentPane().add(label, BorderLayout.NORTH);
            getContentPane().add(textField, BorderLayout.CENTER);

            getContentPane().add(button, BorderLayout.SOUTH);
            button.addActionListener(this);

            setVisible(true);



        }

    public void actionPerformed(ActionEvent event) {
        String text = textField.getText();
        compareToDiceRoll(text);

    }

    public void compareToDiceRoll(String text) {
        int userInput = Integer.parseInt(text);
        int dicerolls = dice.returnResult();
        if(userInput == dicerolls) {
            int pricemoney = userInput * 3;
            JOptionPane.showMessageDialog(this, String.format("You won: %s", pricemoney));
        }
        else {
            JOptionPane.showMessageDialog(this, String.format("You lost: { yourNum: %s  Dicerolls: %s", userInput, dicerolls));
        }
    }

}

