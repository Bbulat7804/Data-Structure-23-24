package Question1;

public class TestList {
    public static void main(String[] args) {
        SList<String> list = new SList<>();
        
        list.appendEnd("Linked List");
        list.appendEnd("is");
        list.appendEnd("easy");
        
        list.display();
        System.out.println(list.contains("difficult"));
        System.out.println(list.contains("easy"));
        list.clear();
        list.display();
    }
}
