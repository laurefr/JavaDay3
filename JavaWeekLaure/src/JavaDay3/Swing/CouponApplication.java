package JavaDay3.Swing;

import javafx.scene.control.ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

/**
 * Created by student on 5/5/2016.
 */
public class CouponApplication extends JFrame{
    public CouponApplication()
    {
        super("Coupon Application");
        setSize(300,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Coupon[] coupons = new Coupon[]{new Coupon("Thai Satay",4.50),
        new Coupon("Macaron",1.00)};

        //comboBox
        JComboBox comboBox= new JComboBox(coupons);
        getContentPane().add(comboBox);

        // Create a Button

        JButton button = new JButton("Save to File");
        button.addActionListener (new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                Object item = comboBox.getSelectedItem();
                 if ( item == null)
                 {

                     showMessage("Please select a coupon");
                 }else{
                     Coupon coupon = (Coupon) item;
                     try{
                         coupon.saveToAFile("coupon.txt");
                         showMessage("The file has successfully been saved");
                     }catch (FileNotFoundException e1){
                         showMessage("Cannot find file ");
                     }
                 }




            }
        });{
getContentPane().add(button);
    setVisible(true);
        }
        }
public void showMessage(String message)
{
    JOptionPane.showMessageDialog(this, message);
}
    public static void main (String []args){
        new CouponApplication();
    }
    }




