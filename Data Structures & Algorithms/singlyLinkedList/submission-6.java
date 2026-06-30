class LinkedList {

    // Node class to represent each node in the linked list
    private class Node {
        int val;
        Node next;

        // constructor to initialize a node
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    // head of the linked list
    private Node head;

    // size of the linked list
    private int size;
    
    // constructor to initialize an empty linked list
    public LinkedList() {
        head = null;
        size = 0;

    }

    // method to get the value of the ith node
    public int get(int i) {

        if ( i < 0 || i >= size) {
            return -1; // when index is out of bounds
        }

        Node current = head;
        for (int j = 0; j < i; j++) {
            current = current.next; // traverse to the index you want to return the value of
        }

        return current.val; // return the value of the current index
        
    }

    // insert a node with value val at the head
    public void insertHead(int val) {
        Node newNode = new Node(val); // create a new node
        newNode.next = head; // the new node points to the the head and the head has the rest of the linkedlist attached to it
        head = newNode; // update the head by assigning the new node as the head
        size++; // increment size        
    }

    // insert a node at the end of the LL
    public void insertTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode; // if the LL is empty, new node becomes the head
        } else {
            Node current = head;
            while (current.next != null) {  // iterate through till there is NULL at the end
                current = current.next; // traverse to the very end of the linkedlist
            }
            current.next = newNode; // link the last node to the new node
        }
        size++; // increase the size of LL by 1

    }
    // use this method to remove the ith node
    public boolean remove(int i) {
        if ( i < 0 || i >= size) {
            return false; // when index is out of bounds
        }

        if (i == 0) { // Special case: removing the head
            head = head.next; // Update head to next node
        } else {
            Node current = head;
            for (int j = 0; j < i - 1; j++) {
                current = current.next; // Traverse to the node before the ith node
            }
            current.next = current.next.next; // Bypass the ith node
        }

        size--; // Decrement size
        return true; // Successful removal
    }

    // method to get all the values in the linkedlist
    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>(); // ArrayList to store the values
        Node current = head;
        while (current != null) {
            values.add(current.val); // Add each node's value to the ArrayList
            current = current.next; // Move to the next node
        }
        return values; // Return the ArrayList of values
    }
}