package StackProgram;

public class StackLinkedList {
    public static Node head;

    public static boolean isEmpty() {
        return head == null;
    }

    //push function
    public static void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //pop function
    public static int pop(){
        if (isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }
    public static int peek(){
        if (isEmpty()){
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(56);
        s.push(60);
        s.push(30);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
