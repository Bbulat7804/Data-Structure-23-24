package Question4;

public abstract class Vehicle {
    double maxSpeed;
    protected double currentSpeed = 0;
    
    Vehicle (int maxSpeed) {
        this.maxSpeed = maxSpeed;
    } 

    abstract void accelerate ();
    
    double getCurrentSpeed () {
        return currentSpeed;
    }
    
    double getMaxSpeed () {
        return maxSpeed;
    }   
    
    void pedalToTheMetal () {
        while (currentSpeed < maxSpeed){
            accelerate ();
        }
    }
}

class Ferrari extends Vehicle {
    
    Ferrari (int maxSpeed) {
        super (maxSpeed);
    }
    
    void accelerate () {
        currentSpeed++;    
    }
}

class main {
    public static void main(String[] args) {
        Ferrari a = new Ferrari (300);
        ;System.out.println("Your current speed is: " + a.currentSpeed + " Km/h");
        a.pedalToTheMetal();
        System.out.println("You have reached your top speed: " + a.currentSpeed + " Km/h");
    }
}
