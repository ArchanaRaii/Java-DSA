public void prepend(int value){
	    Node newNode = new Node(value);
	    if(length == 0){
	        head = newNode;
	        tail = newNode;
	    }else{
	        head.prev = newNode;
	        newNode.next = head;
	        head = newNode;
	    }
	    length++;
	}
