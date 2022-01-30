public class Stack {

    private IntNode _head;

    public Stack() {
        this(null);
    }

    public Stack(IntNode node) {
        this._head = node;
    }

    public IntNode top() {
        return this._head;
    }

    public void setHead(IntNode node) {
        this._head = node;
    }

    public boolean isEmpty() {
        return (this._head == null);
    }

    public void push(IntNode node) {
        if (!this.isEmpty()) 
            node.setNext(this.top());
        this.setHead(node);
    }

    public IntNode pop() {
		if (!this.isEmpty()) {
			IntNode node = this.top();
			this.setHead(node.getNext());
			return node;
		}
        return null;
    }

    public int size() {
        int i = 0;
        IntNode node = this.top();
        while (node != null) {
            i++;
            node = node.getNext();
        }

        return i;
    }

    public void move(Stack s) {
            s.push(this.pop());
    }

    public boolean biggerOrEqual(Stack s) {
        if (this.isEmpty() && s.isEmpty()) 
            return true;
        if (this.isEmpty()) 
            return false;
        if (s.isEmpty()) 
            return true;
        return this.top().getValue() >= s.top().getValue();
    }

    public String toString() {
        String str = "";
        if (!this.isEmpty()) {
            IntNode node = this.top();
            while (node != null) {
                str += (node.getValue() + " -->");
                node = node.getNext();
            }
        }

        return str;
    }
}