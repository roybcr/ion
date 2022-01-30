public class Queue {

    private IntNode _head;
    private IntNode _tail;

    public Queue() {
        this._head = null;
        this._tail = null;
    }

    public IntNode getHead() {
        return this._head;
    }

    public IntNode getTail() {
        return this._tail;
    }

    public void setHead(IntNode head) {
        this._head = head;
    }

    public void setTail(IntNode tail) {
        this._tail = tail;
    }

    public boolean empty() {
        return this._head == null;
    }

    public void enqueue(int num) {
        IntNode temp = new IntNode(num, null);
        if (this.getTail() != null) 
            this.getTail().setNext(temp);
        this.setTail(temp);
        if (this.empty()) 
            this.setHead(temp);
        }
    
    public int dequeue() {
        int temp = this.getHead().getValue();
        this.setHead(this.getHead().getNext());
        return temp;
    }

    public int first() throws Exception {
        if (this.empty()) 
            throw new Exception("Cannot get value of unexisting queue");
        return this._head.getValue();
    }

    public String toString() {
        IntNode temp = this.getHead();
        String str = "";
        while (temp != null) {
            str += temp.getValue() + " <-- ";
            temp = temp.getNext();
        }

        return str;
    }
}