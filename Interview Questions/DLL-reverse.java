public void reverse(){
	     Node current = head;
        Node temp = null;
    
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
    
        temp = head;
        head = tail;
        tail = temp;
	}
