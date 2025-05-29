public class LinkedList {

    private Node head;
    private Node tail;

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
    }

public Node findMiddleNode(){
	    Node slow, fast;
	    slow = head;
	    fast = head;
	    while(fast != null && fast.next != null){
	        slow = slow.next;
	        for(int i = 0; i < 2; i++){
	            fast = fast.next;
	        }
	    }
	    return slow;
	}

}
