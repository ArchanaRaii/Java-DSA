public boolean insert(int index, int value){
	    if(index < 0 || index > length) return false;
	    if(index == 0){
	        prepend(value);
	        return true;
	    }else if(index == length){
	        append(value);
	        return true;
	    }else{
	        Node newNode = new Node(value);
	        Node before = get(index-1);
	        Node after = get(index+1);
	        after = before.next;
	        newNode.next = after;
	        newNode.prev = before;
	        before.next = newNode;
	        after.prev = newNode;
	    }
	    length++;
	    return true;
	    
	}
