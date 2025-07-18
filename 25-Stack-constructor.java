public class Stack {

	private Node top;
	private int height;
	
	class Node{
	    Node next;
	    int value;
	    
	    Node(int value) {
	        this.value = value;
	    }
	}
	
	public Stack(int value){
	    Node newNode = new Node(value);
	    top = newNode;
	    height = 1;
	}

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (height == 0) {
            System.out.println("Top: null");
        } else {
            System.out.println("Top: " + top.value);
        }
        System.out.println("Height:" + height);
        System.out.println("\nStack:");
        if (height == 0) {
            System.out.println("empty");
        } else {
            printStack();
        }
    }
    
    public void makeEmpty() {
        top = null;
        height = 0;
    }
    
}
