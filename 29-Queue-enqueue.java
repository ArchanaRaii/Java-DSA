
	public void enqueue(int value){
	    Node newNode = new Node(value);
	    if(length == 0){
	        first = newNode;
	        last = newNode;
	    }else{
	        last.next = newNode;
	        last = newNode;
	    }
	    length++;
	}
