package radaikin.linkedlist;

import radaikin.linkedlist.Entities.LinkedListWithFriends;
import radaikin.linkedlist.Entities.Node;

public class main {

    public static void main(String[] args) {

        LinkedListWithFriends list = new LinkedListWithFriends();

        Node node1 = list.add(1);
        Node node2 = list.add(2);
        Node node3 = list.add(3);

        Node.makeFriends(node1,node2);

        list.print();

    }
}
