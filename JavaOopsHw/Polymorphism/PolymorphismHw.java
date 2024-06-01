// polymorphism  overriding & overloading example. 

class Override {
    void Identity() {
        System.out.println("Hi, I am an override");
    }
}

class Derived extends Override {
    void Identity() {
        super.Identity(); // super class call to solve the override problem of the base class method
        System.out.println("Hi, I am a Derived class \n ");
    }
}

class MethodOverloading {
    void Results(int a, int b, float c) {
        System.out.println("Addition of 3 numbers is: " + (a + b + c));
    }

    void Results(int a, int b) {
        System.out.println("Addition of 2 numbers is: " + (a + b));
    }

    void Results(double a, int b) {
        System.out.println("Addition of 2 numbers is: " + (a + b));
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(" Method overriding Example \n ");
        Derived obj = new Derived();
        obj.Identity();
        System.out.println(" Method Overloadding Example \n ");
        MethodOverloading obj2 = new MethodOverloading();
        obj2.Results(5, 7, 9.0f);
        obj2.Results(6, 8);
        obj2.Results(15.064883, 3);
    }
}
