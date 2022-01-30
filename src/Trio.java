/**
 * Trio is a Data Structure that uses 3 Stack Objects
 * under the following constraints:
 * 1. s0 is the only Stack that can be initialized.
 * 2. Elements between can be moved only
 * 	  in the direction: s0 -> s1 -> s2 -> s0.
 *
 */

public class Trio {

    private Stack s0;
    private Stack s1;
    private Stack s2;

    public Trio() {
        this(null);
    }

    public Trio(Stack s) {
        this.s0 = s;
        this.s1 = new Stack();
        this.s2 = new Stack();
    }

    public void move(int from) {
        switch (from) {
            case 0:
                s0.move(s1);
                break;
            case 1:
                s1.move(s2);
                break;
            case 2:
                s2.move(s0);
                break;
            default:
                break;
        }
    }

    public boolean isEmpty(int n) {
        switch (n) {
            case 0:
                return s0.isEmpty();
            case 1:
                return s1.isEmpty();
            case 2:
                return s2.isEmpty();
            default:
                return true;
        }
    }

    public boolean biggerOrEqual(int n) {
        switch (n) {
            case 0:
                return s0.biggerOrEqual(s1);
            case 1:
                return s1.biggerOrEqual(s2);
            case 2:
                return s2.biggerOrEqual(s0);
            default:
                return false;
        }
    }

    public String toString() {
		return new String(s0.toString() + " " + s1.toString() + " " + s2.toString());
    }

    public void sort() {
        while (!this.isEmpty(0)) {
            this.maximum();
        }
    }

    public void maximum() {
        this.move(0);
		while (!this.isEmpty(0)) {
            if (this.biggerOrEqual(0)) {
                this.move(1);
                this.move(0);
            } else {
                this.move(0);
                this.move(1);
            }
        }

		while (!this.isEmpty(0)) {
			System.out.println("B");
			this.move(2);
			System.out.println(this);
		}
    }
}