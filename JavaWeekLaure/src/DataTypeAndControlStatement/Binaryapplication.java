package DataTypeAndControlStatement;

/**
 * Created by student on 5/3/2016.
 */
import java.util.Scanner;
public class Binaryapplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String binary = input.nextLine();

        //get length of input
        //int length = String.valueOf(input).length();

        BinaryConversion(binary);

    }

    static void BinaryConversion(String number) {
        int result = 0, mult = 1;

        for (int i = number.length() - 1; i >= 0; i--) {
            if (number.charAt(i) == '1') {
                result += mult;
            }
            mult = mult * 2;
        }
        ;
        System.out.println("Decimal value: " + result);
    }
}