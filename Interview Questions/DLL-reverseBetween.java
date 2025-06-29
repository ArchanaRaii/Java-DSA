public void reverseBetween(int startIndex, int endIndex) {
         Node dummy = new Node(0);
         if(head == null) return;
         if(startIndex == endIndex) return;
         Node prev = dummy;
         dummy.next = head;
         head.prev = dummy;
         for(int i = 0; i < startIndex; i++){
             prev = prev.next;
         }
         Node current = prev.next;
         for(int i = 0; i < endIndex - startIndex; i++){
             Node toMove = current.next;
             
             current.next = toMove.next;
             if(toMove.next != null) toMove.next.prev = current;
             
             prev.next.prev = toMove;
             toMove.next = prev.next;
             toMove.prev = prev;
             prev.next = toMove;
         }
         head = dummy.next;
         head.prev = null;
    }
