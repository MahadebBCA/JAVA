
// write a java program to demonstrate the public private protected.


class AccessModifiers {
    // public variable
    public String publicVar = "I am a public variable.";

    // private variable
    private String privateVar = "I am a private variable.";

    // protected variable
    protected String protectedVar = "I am a protected variable.";

    // public method
    public void publicMethod() {
        System.out.println("This is a public method.");
        // Can access all variables within the same class
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
    }

    // private method
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // protected method
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // method to demonstrate access to private method within the same class
    public void accessPrivateMethod() {
        privateMethod();
    }
}

class Subclass extends AccessModifiers {
    public void demonstrateAccess() {
        // Accessing public variable
        System.out.println(publicVar);

        // Accessing protected variable
        System.out.println(protectedVar);

        // Accessing public method
        publicMethod();

        // Accessing protected method
        protectedMethod();

        // Trying to access private variable or method will result in a compile-time error
        // System.out.println(privateVar); // Error
        // privateMethod(); // Error
    }
}

public class Main {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        // Accessing public variable and method from outside the class
        System.out.println(obj.publicVar);
        obj.publicMethod();

        // Accessing protected variable and method from outside the class
        // Not directly accessible without inheritance
        // System.out.println(obj.protectedVar); // Error
        // obj.protectedMethod(); // Error

        // Accessing private variable and method from outside the class
        // System.out.println(obj.privateVar); // Error
        // obj.privateMethod(); // Error

        // Subclass demonstration
        Subclass subObj = new Subclass();
        subObj.demonstrateAccess();

        // Demonstrate access to private method through a public method
        obj.accessPrivateMethod();
    }
}
