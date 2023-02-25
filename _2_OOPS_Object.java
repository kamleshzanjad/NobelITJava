package session1;

public class _2_OOPS_Object {
    int i = 10;
    String s = "FirstName";

    public _2_OOPS_Object() {
        i = 0;
        s = "New name";
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}


class TestA {
    public static void main(String[] args) {
        // creating  first object of class
        _2_OOPS_Object obj1 = new _2_OOPS_Object();
        obj1.i = 1;
        obj1.s = "A";
        System.out.println("Print id  " + obj1.i);
        System.out.println("Print Name  " + obj1.s);

        // creating second object of class
        _2_OOPS_Object obj2 = new _2_OOPS_Object();
        obj2.i = 2;
        obj2.s = "B";
        System.out.println("Print id  " + obj2.i);
        System.out.println("Print Name  " + obj2.s);

    }

}

/* output is

Print id  1
Print Name  A
Print id  2
Print Name  B
 */