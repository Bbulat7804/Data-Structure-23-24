package Question6;

public class MinMaxTwoDArray {
    
    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0];
        
        for(int i=0 ; i<list.length ; i++){
            for(int j=0 ; j<list[i].length ; j++){
                if(min.compareTo(list[i][j])>0)
                    min = list[i][j];
            }
        }
        return min;
    }
    
    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];
        
        for(int i=0 ; i<list.length ; i++){
            for(int j=0 ; j<list[i].length ; j++){
                if(max.compareTo(list[i][j])<0)
                    max = list[i][j];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Integer[][] numbers = {{1,2,3},{4,6,8}};
        
        System.out.println(min(numbers));
        System.out.println(max(numbers));
    }
}

