package week5;

import week5.Node;

public interface InterfaceStackAndQueue {
    public boolean isEmpty(Node head);
    public Node create(int value);
    public Node push(Node head, int value);
    public Node pop(Node head);
    public void show(Node head);
}