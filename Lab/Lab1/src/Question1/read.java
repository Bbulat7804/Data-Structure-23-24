package Question1;

import java.io.*;
import java.util.Scanner;

public class read {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner (new FileInputStream ("Hazim_22001772.txt"));
            while (input.hasNext()){
                System.out.println(input.nextLine());
            }
        }
        
        catch (FileNotFoundException e) {
            System.out.println("IO error");
        }
        
    }
}
