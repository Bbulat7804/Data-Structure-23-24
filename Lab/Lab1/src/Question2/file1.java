package Question2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class file1 {
    public static void main(String[] args) {
        try {
            int count = 0, index=0;
            Scanner inputStream = new Scanner(new FileInputStream("text1.txt"));
            ArrayList<String[]> arr = new ArrayList<>();
            
            while(inputStream.hasNextLine()){
                arr.add(inputStream.nextLine().split(","));
                count +=arr.get(index++).length;
            }            
            
            System.out.println("Number of element: " + count);
            
            for(int i=0 ; i<arr.size() ; i++){
                for(int j=0 ; j<arr.get(i).length ; j++){
                    System.out.print(arr.get(i)[j]);
                }
                System.out.println();
            }
        }
        catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
