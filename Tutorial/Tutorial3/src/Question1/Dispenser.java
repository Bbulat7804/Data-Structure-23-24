package Question1;

public class Dispenser {
    private double cost;
    private int numOfItems;
    
    Dispenser(double cost, int numOfItems){
        this.cost = cost;
        this.numOfItems = numOfItems;
    }
    
    public int getCount () {
        return numOfItems;
    }
    
    public double getProductCost (){
        return cost;
    }
    
    public boolean makeSale (int bilangan){
        if (numOfItems >= bilangan) {
            numOfItems -= bilangan;
            return true;
        }
    }
}
