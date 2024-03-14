package Question8;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
        
        numOfCars.add(4);
        numOfCars.add(7);
        numOfCars.add(9);
        numOfCars.add(12);
        milesPerHour.add(12.3);
        milesPerHour.add(21.96);
        milesPerHour.add(10.7);
        milesPerHour.add(5.89);
        milesPerHour.add(13.5);
        
        display(numOfCars);
        display(milesPerHour);
    }
    
    static void display(ArrayList<?> arr){
        System.out.println("Array Content");
        for(int i=0 ; i<arr.size() ; i++){
            System.out.println((i+1) + ".  " + arr.get(i));
        }
        System.out.println();
    }
}
