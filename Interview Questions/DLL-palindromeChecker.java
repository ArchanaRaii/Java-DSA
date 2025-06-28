public boolean isPalindrome(){
	    if(length <= 1) return true;
	    Node front = head;
	    Node behind = tail;
	    while(front != null && behind != null){
	        if(front.value != behind.value) return false;
	        front = front.next;
	        behind = behind.prev;
	    }
	    return true;
	}
