public boolean set(int index, int value){
	    Node temp = get(index);
	    if(temp != null){
	        temp.value = value;
	        return true;
	    }else{
	        return false;
	    }
	}
