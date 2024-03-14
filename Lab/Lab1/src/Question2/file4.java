package Question2;

import java.io.*;
import java.util.Scanner;

public class file4 {
    public static void main(String[] args) {
        
        try{
            Scanner inputStream = new Scanner(new FileInputStream("text4.txt"));
            String line = inputStream.nextLine();
            line = line.replaceAll("[0-9]", "");
            
            System.out.println("Number of Characters: " + line.length());
            
            for(int i=0 ; i<line.length() ; i++){
                System.out.print(line.charAt(i) + " ");
            }
        }
        catch(IOException e){
            
        }
    }
}
