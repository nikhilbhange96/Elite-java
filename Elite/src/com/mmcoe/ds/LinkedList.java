package com.mmcoe.ds;

public class LinkedList<T> {

    private class Node {
        private T data;
        public Node next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    private Node head, last;
    private int size;

    public void add(T data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            last = n;
        } else {
            last.next = n;
            last = n;
        }

        size++;
    }

    public void print() {
        Node current = head;

        while (current != null) {
            System.out.println(current.getData());
            current = current.next;
        }

        System.out.println();
    }

    public void insert(int idx, T data) {

        if(idx<0 || idx>size) {
            throw new IllegalArgumentException("Index Out of bound");
        }

        Node n = new Node(data);

        if(idx==0) {
            n.next=head;
            head=n;

            if(size==0) {
                last=n;
            }
        } else {
            Node t=head;

            for (int i=0; i<idx-1; i++) {
                t= t.next;
            }

            n.next=t.next;
            t.next=n;

            if (n.next==null) {
                last=n;
            }
        }

        size++;
    }
    public void remove(int idx) {
    	Node curr=head;
    	for(int c=1;true;c++,curr=curr.next) {
    		if(c==idx) {
    			curr.next=curr.next.next;
    			break;
    		}
    	}
    	
    	
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(20);
        list.add(30);
        list.add(40);

        list.insert(1, 25);
        list.insert(0, 10);
        list.remove(4);
        list.print();
    }
}