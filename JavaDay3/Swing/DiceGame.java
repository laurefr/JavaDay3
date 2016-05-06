package JavaDay3.Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Random;

/**
 * Created by student on 5/5/2016.
 */
public class DiceGame {
    int dice1;
    int dice2;

    public DiceGame() {
        rollDices();
    }

    public void rollDices()
    {
        Random rand = new Random();
        dice1 = rand.nextInt(6) + 1;
        dice2 = rand.nextInt(6) + 1;
    }

    public int returnResult()
    {
        return (dice1 + dice2);
    }



}
