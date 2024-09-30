package Assignment4;

public class Main {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.insertInLinkedList(2,0);
        list.insertInLinkedList(3,1);
        list.insertInLinkedList(4,2);
        list.insertInLinkedList(5,3);
        list.insertInLinkedList(6,4);


        list.traverseLinkedList();

        list.searchNode(4);

        list.deleteNode(6);
        list.traverseLinkedList();


    }
}
