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
  
  public Node findKthFromEnd(int k){
	    Node slow, fast;
	    slow = head;
	    fast = head;
        for(int i = 0; i < k; i++){
            if(fast == null) return null;
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
	    return slow;
	}

}
