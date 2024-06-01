import java.util.Scanner;
class Student {
    private String name;
    private int age;
    // TO access private value as a data security using encapsulation  set & get method & initialize them 
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
this.age=age;
    }
    public int getAge() {
        return age;
    }
}

public class Main {
      // checking age is valid input or not using method & static keyword 
      public static  int checkAge(int age ){
                if(age > 0) {
            return age;
        }
   else{
       return 0;
   }
       }
    public static void main(String[] args) {
        // taking a user input 
        Scanner Input =new Scanner(System.in);
          System.out.println("Enter your Name:");
         String name=Input.nextLine();
        System.out.print("Enter your Age:") ;
         int age=Input.nextInt();
         // Create class object & set value using user input 
        Student student = new Student();
        student.setName(name);
        student.setAge(checkAge(age));
        // then print value of encapsulation example 
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
