package radaikin.linkedlist.Entities;

public class LinkedListWithFriends {

    private Node head;

    public Node add(Integer data){

        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        } else {
            Node last = head;
            while (last.getNext() != null){
                last = last.getNext();
            }
            last.setNext(newNode);
        }

        return newNode;
    }

    public void print(){

        Node current = head;

        System.out.println("List: ");

        while (current != null){

            System.out.println(current.getData().toString());

            current = current.getNext();
        }
    }
}
