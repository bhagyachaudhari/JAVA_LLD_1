package com.example.oop.accessmodifiersandconstructors;

public class Node {

    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Node(Node node){
        this.data = node.data;
        this.next=null;
        if(node.next!=null){
            this.next = new Node(node.next);
        }
    }
}
