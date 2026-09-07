class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class Deque {
    private Node dummyHead;
    private Node dummyTail;
    public Deque() {
        this.dummyHead = new Node(0);
        this.dummyTail = new Node(0);

        this.dummyHead.next = this.dummyTail;
        this.dummyTail.prev = this.dummyHead;
    }

    public boolean isEmpty() {
        return this.dummyHead.next == this.dummyTail;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        Node lastNode = this.dummyTail.prev; // Get current last real node

        // Wire up the new node
        newNode.prev = lastNode; // New node's prev -> current last node
        newNode.next = this.dummyTail; // New node's next -> dummy tail

        // Update connections
        lastNode.next = newNode; // Current last node now points to new node
        this.dummyTail.prev = newNode; // Dummy tail now points back to new node
    }

    public void appendleft(int value) {
        Node newNode = new Node(value);
        Node firstNode = this.dummyHead.next;

        firstNode.prev = newNode;
        newNode.prev = this.dummyHead;
        newNode.next = firstNode;
        this.dummyHead.next = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        Node targetNode = this.dummyTail.prev;
        Node prevNode = targetNode.prev;
        int value = targetNode.value;
        this.dummyTail.prev = prevNode;
        prevNode.next = this.dummyTail;
        return value;
    }

    public int popleft() {
        if (isEmpty()) {
            return -1;
        }
        Node targetNode = this.dummyHead.next;
        Node nextNode = targetNode.next;
        int value = targetNode.value;
        this.dummyHead.next = nextNode;
        nextNode.prev = this.dummyHead;
        return value;
    }
}
