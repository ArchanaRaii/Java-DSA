public Node remove(int index){
	    if(index < 0 || index >= length) return null;
	    if(index == 0){
	        return removeFirst();
	    }else if(index == length-1){
	        return removeLast();
	    }else{
	        Node temp = get(index);
	        temp.next.prev = temp.prev;
	        temp.prev.next = temp.next;
	        temp.next = null;
	        temp.prev = null;
	        length--;
	        return temp;
	    }
	    
	} 
