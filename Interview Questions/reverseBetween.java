public void reverseBetween(int m, int n){
        if (head == null) return;
        int startIndex = m;
        int endIndex = n;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        for(int i = 0;i < m; i++){
            prev = prev.next;
        }
        Node current = prev.next;
        for(int i = 0; i < (n - m) ; i++){
            Node toMove = current.next;
            current.next = toMove.next;
            toMove.next = prev.next;
            prev.next = toMove;
        }
        head = dummy.next;
    }
