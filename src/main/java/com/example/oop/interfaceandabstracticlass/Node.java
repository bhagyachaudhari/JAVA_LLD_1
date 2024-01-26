package com.example.oop.interfaceandabstracticlass;

// write your code here
import java.util.Iterator;
public class Node implements Iterable<Node> {

    public int data;
    public Node next;

    public Node(int data){
        this.data = data;
    }

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }
}

class NodeIterator implements Iterator<Node> {

    private Node head;

    public NodeIterator(Node head) {
        this.head = head;
    }

    @Override
    public boolean hasNext() {
        return this.head != null;
    }

    @Override
    public Node next() {
        Node temp = head;
        head = head.next;
        return temp;
    }
}


