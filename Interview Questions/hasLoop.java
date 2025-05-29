public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
  
public boolean hasLoop(){
	    Node slow, fast;
	    slow = head;
	    fast = head;
	    while(fast != null && fast.next != null){
	        slow = slow.next;
	        fast = fast.next.next;
	        if(slow == fast){
	            return true;
	        }

	    }
        return false;
	}
