package Question5;

public class TowerOfHanoi {
    public static void main(String[] args) {
        MyStack<Integer> tower1 = new MyStack();
        MyStack<Integer> tower2 = new MyStack();
        MyStack<Integer> tower3 = new MyStack();
        
        tower1.push(4);
        tower1.push(3);
        tower1.push(2);
        tower1.push(1);
        displayTower(tower1, tower2, tower3);
        solveTowerOfHanoi(4, tower1, tower2, tower3);
    }
    
    public static void displayTower(MyStack<Integer> tower1, MyStack<Integer> tower2, MyStack<Integer> tower3){
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        int[] arr3 = new int[4];
        int size1 = tower1.getSize();
        int size2 = tower2.getSize();
        int size3 = tower3.getSize();
        
        for(int i=size1-1 ; i>=0 ; i--){
            arr1[i] = tower1.pop();
        }
        for(int i=size2-1 ; i>=0 ; i--){
            arr2[i] = tower2.pop();
        }
        for(int i=size3-1 ; i>=0 ; i--){
            arr3[i] = tower3.pop();
        }
        
        for(int i=0 ; i<4 ; i++){
            if(arr1[i]!=0)
                tower1.push(arr1[i]);
            if(arr2[i]!=0)
                tower2.push(arr2[i]);
            if(arr3[i]!=0)
                tower3.push(arr3[i]);
            
            System.out.println((arr1[3-i]==0 ? "|" : arr1[3-i]) + " " + (arr2[3-i]==0 ? "|" : arr2[3-i]) + " " + (arr3[3-i]==0 ? "|" : arr3[3-i]));
        }
        System.out.println();
    }
    
    public static void solveTowerOfHanoi(int n, MyStack<Integer> source, MyStack<Integer> auxiliary, MyStack<Integer> destination) {

        int totalMoves = (int) Math.pow(2, n) - 1;

        // If number of disks is even, swap destination and auxiliary towers
        if (n % 2 == 0) {
            MyStack<Integer> temp = destination;
            destination = auxiliary;
            auxiliary = temp;
        }

        for (int move = 1; move <= totalMoves; move++) {
            if (move % 3 == 1) {
                moveDisksBetweenTowers(source, destination);
            } else if (move % 3 == 2) {
                moveDisksBetweenTowers(source, auxiliary);
            } else if (move % 3 == 0) {
                moveDisksBetweenTowers(auxiliary, destination);
            }
            displayTower(source, auxiliary, destination);
        }
    }

    public static void moveDisksBetweenTowers(MyStack<Integer> source, MyStack<Integer> destination) {
        if (!source.isEmpty() && (destination.isEmpty() || source.peek() < destination.peek())) {
            destination.push(source.pop());
        } else if (!destination.isEmpty() && (source.isEmpty() || destination.peek() < source.peek())) {
            source.push(destination.pop());
        }
    }
}
