public Node pop(){
	    if(height == 0) return null;
	    Node temp = top;
	    top = top.next;
	    temp.next = null;
	    height--;
	    return temp;
	}
