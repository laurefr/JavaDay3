package JavaDay3.Swing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

/**
 * Created by student on 5/5/2016.
 */
public class Coupon {

    private String description;
    private double value;
    private Scanner fileReader;

    public Coupon(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "description='" + description + '\'' +
                ", value=£" + value +
                '}';
    }

    public void loadInfoFromFile()
    {
         fileReader = new Scanner(getClass().getResourceAsStream("input.tx"));
    }
    public Scanner getFileReader()
    {
        return fileReader;
    }
    public void saveToAFile(String fileName) throws FileNotFoundException {
        File file= new File(fileName);
        PrintWriter pw=  new PrintWriter(file);
        pw.println("Description:" + getDescription());
        pw.println("Value:" + getValue());
        pw.close();
    }


}
