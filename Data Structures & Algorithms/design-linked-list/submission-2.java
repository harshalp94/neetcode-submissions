class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
    ListNode(int val, ListNode next, ListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
class MyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;
    public MyLinkedList() {
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }
    private ListNode getPrevious(int index) {
        if (index <= size / 2) {
            ListNode cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur;
        } else {
            ListNode cur = tail;
            for (int i = 0; i < size - index + 1; i++) {
                cur = cur.prev;
            }
            return cur;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        return getPrevious(index).next.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size)
            return;
        if (index < 0)
            index = 0;
        ListNode node = new ListNode(val);
        ListNode prev = getPrevious(index);
        ListNode nextNode = prev.next;
        prev.next = node;
        node.next = nextNode;
        nextNode.prev = node;
        node.prev = prev;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;
        ListNode prev = getPrevious(index);
        ListNode cur = prev.next;
        ListNode nextNode = cur.next;
        prev.next = nextNode;
        nextNode.prev = prev;
        size--;
    }
}
