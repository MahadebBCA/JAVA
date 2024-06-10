// /**
//  * ExceptionHandling
//  */
// public class ExceptionHandling {

//     public static void main(String[] args) {
//         // int []arr = new int[5];
//         int arr1[] = { 2, 3, 4, 5, 5 }; // here we initialize array
//         // System.out.println(arr1[5]);
//         String name = null;
//         try {
//             // System.out.println(arr1[5]);
//             System.out.println(name);
//         } catch (/* ArrayIndexOutOfBoundsException */ Exception e) {
//             System.out.println(" you can not assign the value of string " + e.getMessage());
//             // here can not print extra dailaugue its only print exception messages

//         }

//     }
// // }

// public class ExceptionHandling {

//     public static void main(String[] args) {
//         String name = null;
//         try {
//             System.out.println(name.length()); // try to print length of a string but
//             // itis not print its occurs error

//         } catch (Exception e) {// here exception is a class
//             System.out.println("Exception caught: " + e.getMessage());
//         }
//     }
// }

// checked exception  with factorial program 
/**
 * ExceptionHandling
 */
//  public class ExceptionHandling {

//     public static void main(String[] args) throws InterruptedException {
//         int k=0;
//         for( int i=0;i<=10;i++){
//             k +=i;
//             System.out.println(k );// factorial of all ith value
//             Thread.sleep(1000);
//         }
//     }
//  }

// thread return 
/**
 * ExceptionHandling
// //  */
// public class ExceptionHandling {

//     public static void main(String[] args) throws InterruptedException {
//         String name = " mahadeb maity";
//         System.out.println(name.length());
//         System.out.println(name);
//         Thread.sleep(2000);
//     }
// }

// custom exception handling thats means exception create by user 

/**
 * ExceptionHandling
 */
class exceptions extends Exception {
    exceptions() {
        super(" are you sure you give your vote? otherswise please rest at home");
    }

    exceptions(String messages) {
        super(messages);
    }
}

public class AreYouVoter {

    public static void main(String[] args) throws Exception {
        int age = 85;
        // use try catch block
        try {
            if (age >75) {
                throw new exceptions(" you need rest at home, you are oldest man ");
            }
        } catch (Exception e) {
        System.out.println(e.getMessage());
        } finally{
            System.out.println(" thank you  uncle ");
        }

        // if (age < 18) {
        // throw new exceptions("sorry you are not a voter please leave now from here
        // ");
        // /*
        // * when we pass user messages then output occers
        // * xception in thread "main" exceptions: sorry you are not a voter please
        // leave
        // * now from here
        // * at ExceptionHandling.main(ExceptionHandling.java:87)
        // */

        // /*
        // * others wise print my messages
        // * Exception in thread "main" exceptions: you are not eligible for voting
        // * at ExceptionHandling.main(ExceptionHandling.java:87)
        // */

        // }
    }
}

