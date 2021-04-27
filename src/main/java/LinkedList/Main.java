package LinkedList;


public class Main {

    public static void main(String[] args) {

       LinkedList list = new LinkedList();
       list.insert(10);
       list.insert(23);
       list.insert(45);

       list.insertAtBeginning(21);
       list.insertAtIndex(3, 11);

       list.deleteValueAtIndex(2);

       list.showValues();

    }
}
