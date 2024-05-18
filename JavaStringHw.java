
// string home work of java language 
import java.util.Scanner;
public class stringHw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) ... HW1) ... Write a  java program to print a string entered by user.
        System.out.println("Hw1 output");
        System.out.println("Enter a string by user:");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput + "\n");

    
        //...Hw2) ... Write a  java program to input and display the sentence I love candies
        System.out.println("Hw2 output");
        System.out.println("Enter the sentence: 'I love candies'");
        String UserInput = scanner.nextLine();
        System.out.println("Thanks for your entered: " + UserInput + "\n");

        //...Hw3)... Write a java program to find the length of the string "refrigerator".
        System.out.println("Hw3 output");
        String word  = "refrigerator";
        int length = word.length();
        System.out.println("The length of the string 'refrigerator' is: " + length + "\n");

        //...Hw4) ...write a java program to differentiate `equals` and `==` and `compareTo`  method.
        System.out.println("Hw4 output");
        String str1 = "Mahadeb";
        String str2 = new String("Mahadeb");
        String str3 = "shuvrapatra";

        // Using '=='
        System.out.println("Using '==':");
        //output will be  "false" because they are different objects that means("=="  condition check value & object in a memory ) 
        System.out.println("str1 == str2: " + (str1 == str2)); 
        System.out.println("str1 == Mahadeb " + (str1 == "Mahadeb")); // true, because str1 and "Mahadeb"  both are same string 

        // Using 'equals'
        System.out.println("\nUsing 'equals':");
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true, because they have the same content
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // false, because they have different content

        // Using 'compareTo'
        System.out.println("\nUsing 'compareTo':");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0, because they have the same content
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // a negative number, because "Mahadeb" is less than "shuvra"
        System.out.println("str3.compareTo(str1): " + str3.compareTo(str1)); // a positive number, because "shuvrapatra" is  greater than "Mahadeb"

        scanner.close();
    }
}
