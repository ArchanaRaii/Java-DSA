public Node dequeue(){
	    if(length == 0) return null;
	    Node temp = first;
	    if(length == 1){
	        first = null;
	        last = null;
	    }else{
	        first = first.next;
	        temp.next = null;
	    }
	    length--;
	    return temp;
	}
