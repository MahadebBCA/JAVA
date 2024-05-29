import java.util.Scanner;

/**
 * ReturnstringHw class : 1. How do you reverse a string in Java?
 */
public class ReturnstringHw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter your name :");
        String input = scanner.nextLine();
        System.out.print(" reverse is :");
        StringBuilder ab1 = new StringBuilder(input);
        String store = ab1.reverse().toString();// tostring method used because stringbuilder method can't return string
                                                // value so use tostring method & convert stringbuilder to string
        System.out.println(store); // here reverse method reverse the ab1 object of classes value

        /*
         * ReturnstringHw class : 2:: How do you check if a string is a palindrome in
         * Java?
         */
        System.out.println(" enter the  any string:");
        String str = scanner.nextLine();

        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();

        if (str.equals(str1.toString())) {
            System.out.println(" this is a Palindrome String");
        } else {
            System.out.println(" this is Not a palindrome String");
        }

        /**
         * * Main /* ReturnstringHw class : 4. How do you convert a string to an integer
         * in Java?
         */

        String value = "123";
        int Intvalue = Integer.parseInt(value);
        System.out.println(Intvalue);

        /**
         * Main /* ReturnstringHw class : 4. How do you convert a integer to string in
         * Java?
         */
        int number = 123;
        String strNumber = String.valueOf(number);// this is can't return right output 
        System.out.println(strNumber);

    }

}
