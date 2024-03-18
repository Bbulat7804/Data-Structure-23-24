package Question1;

import java.io.*;
import java.util.Scanner;

public class write {
    public static void main(String[] args) {
        try {
            PrintWriter output =  new PrintWriter (new FileOutputStream ("ABU_12345678.txt", true));
            Scanner input = new Scanner (System.in);
            System.out.print("Enter curahat anda: ");
            output.println(input.nextLine());
            output.close();
        }
        
        catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
