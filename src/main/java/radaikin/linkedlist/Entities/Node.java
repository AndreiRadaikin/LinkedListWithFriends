package radaikin.linkedlist.Entities;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private Integer data;
    private Node next;
    private List<Node> friends = new ArrayList<Node>();

    public Node(Integer data) {
        this.data = data;
    }


    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setFriends(List<Node> friends) {
        this.friends = friends;
    }

    public List<Node> getFriends() {
        return friends;
    }

    public void setFriends(Node node) {
        this.friends.add(node);
    }

    public static void makeFriends(Node from, Node to){

        from.setFriends(to);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (!data.equals(node.data)) return false;
        if (next != null ? !next.equals(node.next) : node.next != null) return false;
        return friends != null ? friends.equals(node.friends) : node.friends == null;
    }

    @Override
    public int hashCode() {
        int result = data.hashCode();
        result = 31 * result + (next != null ? next.hashCode() : 0);
        result = 31 * result + (friends != null ? friends.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
