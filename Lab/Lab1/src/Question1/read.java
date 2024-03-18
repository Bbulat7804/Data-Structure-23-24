package Question1;

import java.io.*;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (new FileInputStream ("ABU_12345678.txt"));
            while (input.hasNext()){
                System.out.println(input.nextLine());
            }
        }
        
        catch (FileNotFoundException e) {
            System.out.println("IO error");
        }
        
    }
}
