	public void append(int value){
	    Node newNode = new Node(value);
	    if(length == 0){
	        head = newNode;
	        tail = newNode;
	    }else{
	        tail.next = newNode;
	        newNode.prev = tail;
	        tail = newNode;
	    }
	    length++;
	}
