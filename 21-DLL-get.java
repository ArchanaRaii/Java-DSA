public Node get(int value){
	    int index = value;
	    if(index < 0 || index >= length) return null;
	    Node temp = head;
	    if(index < length/2){
	        for(int i = 0; i < index; i++){
	            temp = temp.next;
	        }
	    }else{
	        temp = tail;
	        for(int i = length - 1; i > index; i--){
	            temp = temp.prev;
	        }
	    }
	    return temp;
	}
