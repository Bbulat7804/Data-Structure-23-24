package Question1;

import java.io.*;

public class append {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter (new FileOutputStream ("ABU_12345678.txt", true));
            
            output.println("Saya tido dalam kelas.");
            output.println("Tidak, saya kiciwa");
            output.println("hidup kene keras dik");
            output.println("Saya target A solid sahaja");
            output.close();
        }
        
        catch (IOException e) {
            System.out.println("IO error");
        }
    }
}
