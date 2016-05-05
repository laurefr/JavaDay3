package JavaDay2.Arrays;

/**
 * Created by student on 5/4/2016.
 */
import java.io.*;
import java.util.Scanner;
public class InputOutput {
    public static void main (String[] arg){


        Scanner input = new Scanner (System.in);
        System.out.println("Enter a string:");

        //read line input
        String str = input.nextLine();
        System.out.println (" Using Scanner:" + str);

        // Create a buffer reader

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str2 = "";
        try{
            str2 = br.readLine();
        } catch(IOException e)
        {
            e.printStackTrace();
        }

System.out.println("Using InputStreamReader" + str2);

// write to a file

        System.out.println(System.getProperty("user.dir"));
        String fileName = "test.txt";
        try
        {
            FileWriter fileW = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter (fileW);
            bw.write(str2);
        }
catch(IOException ex)
        {
            System.out.println("Error writing to a file :" + fileName);
        }
    }
}

