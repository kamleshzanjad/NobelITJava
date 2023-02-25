package session1;

class Employee {
    int sal = 15000;

    /// method overloading
    // Method with 2 arguments of type integer
    public void add(int x, int y) {
        System.out.println("Printing sum of two Integers");
        System.out.println(x + y);
    }

    // Method with 3 arguments of type integer
    public void add(int x, int y, int z) {
        System.out.println("Printing sum of three Integers");
        System.out.println(x + y + z);
    }

    // Method with 2 arguments of type Float
    public void add(float x, float y) {
        System.out.println("Printing sum of two Integers");
        System.out.println(x + y);
    }

}

class Programmer extends Employee {
    int bonus = 2500;

    /// method overriding  : provide detail specific implementation of existing parent method
    public void add(int x, int y) {
        System.out.println("Printing sum of two Integers in Child class with detail implementations");
        System.out.println("Inside Child class");
        System.out.println("First Number is  " + x);
        System.out.println("Second Number is  " + y);
        System.out.println(x + y);
    }

}

class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("Employee Salary is " + e.sal);

        Programmer p = new Programmer();
        System.out.println("Programmer Salary is " + p.sal);  // inherited property sal from parent class
        System.out.println("Programmer Bonus is " + p.bonus);

        System.out.println(" Calling Add method from employee  with 2 arguments");
        e.add(10, 20);

        System.out.println(" Calling Add method from Programmer  with 2 arguments");
        p.add(10, 20);


        System.out.println(" Calling Add method from employee with 3 arguments ");
        e.add(10, 20, 30);

    }
}
