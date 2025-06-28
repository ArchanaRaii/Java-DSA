public void swapPairs() {
        if (head == null) return;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node first = head;
        while(first != null && first.next != null){
           Node second = first.next;
           prev.next = second;
           first.next = second.next;
           second.next = first;
           prev = first;
           first = first.next;
        }
        head = dummy.next;
    }
