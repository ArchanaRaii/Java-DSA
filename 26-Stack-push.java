public void push(int value){
	    Node newNode = new Node(value);
	    if(height == 0){
	       top = newNode; 
	    }else{
	        newNode.next = top;
	        top = newNode;
	    }
	    height++;
	    
	}
