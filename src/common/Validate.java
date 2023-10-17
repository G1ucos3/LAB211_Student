package common;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Validate {

    public String checkString(String s) {
        String str = "";
        while (str.isBlank() || str.isEmpty()) {
            System.out.print(s + ": ");
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
        }
        return str;
    }

    public float checkMark(String s) {
        float num = -1;
        while (num < 0 || num > 100) {
            Scanner sc = new Scanner(System.in);
            System.out.print(s + ": ");
            try {
                num = sc.nextFloat();
            } catch (InputMismatchException e) {
                System.err.println("Enter number (0 < num < 100)");
            }
        }
        return num;
    }

    public boolean inputYN(String s) {
        while (true) {
            String str = checkString(s);
            if (str.equalsIgnoreCase("Y")) {
                return true;
            } else if (str.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please enter Y or N");
        }
    }
}
