package session1;

/// mark all variables as private and see changes in TestClass
class A {
//    int i = 10;
//    String s = "FirstName";

    private int i = 10;
    private String s = "FirstName";

    public A() {
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


class TestClass {
    public static void main(String[] args) {
        // creating  first object of class
        A obj = new A();
//        obj1.i = 1;
//        obj1.s = "A";
//        System.out.println("Print id  " + obj1.i);
//        System.out.println("Print Name  " + obj1.s);

        obj.setI(3);
        obj.setS("C");
        System.out.println("Print id " + obj.getI());
        System.out.println("Print name " + obj.getS());

    }

}

/* output is

Print id 3
Print name C

 */