package Question1;


public class Telephone {
    private String areaCode;
    private int number;
    static int numOfTelephoneObject = 0;

    public Telephone(String areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
        numOfTelephoneObject++;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
    
    public String makeFullNumber () {
        return areaCode + "-" + number;
    }
    
}

class main {
    public static void main(String[] args) {
        Telephone[] arrayTelephone= new Telephone[5];
        int number = 79676300;
        for(int i=0 ; i<5 ; i++){
            arrayTelephone[i] = new Telephone("03", number++);
        }
        
        for (int i=0; i<5; i++) {
            System.out.println(arrayTelephone[i].makeFullNumber());
        }
        
        System.out.println("Phone numbers created: " + Telephone.numOfTelephoneObject);
    }
}