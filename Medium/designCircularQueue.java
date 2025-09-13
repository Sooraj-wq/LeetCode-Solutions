public class designCircularQueue {
public class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
}
    
class MyCircularQueue {

    int capacity = 0;
    int size = 0;
    Node rear = null;
    Node front = null;
    
    public MyCircularQueue(int k) {
        capacity = k;
    }
    
    public boolean enQueue(int value) {

        if(isFull()){
            return false;
        }

        Node newNode = new Node(value);
        
        if(rear == null){
            front = rear = newNode;
            newNode.next = newNode;
            size++;
            return true;
        }

        newNode.next = front;
        rear.next = newNode;
        rear = newNode;
        size++;

        return true;
    }
    
    public boolean deQueue() {

        if(isEmpty()){
            return false;
        }

        if(front == rear){
            front = rear = null;
            size = 0;
            return true;
        }

        front = front.next;
        rear.next = front;
        size--;
        return true;
        
    }
    
    public int Front() {
        
        if(isEmpty()){
            return -1;
        }
        
        return front.data;
    }
    
    public int Rear() {

        if(isEmpty()){
            return -1;
        }

        return rear.data;

    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}
}
