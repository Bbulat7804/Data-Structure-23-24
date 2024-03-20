package Question5;

public class FindMax {
    static class Circle implements Comparable<Circle>{
        
        Double radius;

        public Circle(double radius) {
            this.radius = radius;
        }
        
        @Override
        public int compareTo(Circle o) {
            return radius.compareTo(o.radius);
        }
        
        public String toString(){
            return "Radius = " + radius;
        }
    }
    
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3};
        String [] arr2 = {"red","green","blue"};
        Circle[] arr3 = {new Circle(3),new Circle(2.9),new Circle(5.9)};
        System.out.println(max(arr1));
        System.out.println(max(arr2));
        System.out.println(max(arr3));
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        E maximum = list[0];
        
        for(int i=1 ; i<list.length ; i++){
            if(maximum.compareTo(list[i])<0)
                maximum = list[i];
        }
                
        return maximum;        
    }
}
