
/* * Question 1: ))   Explain Constructor   Chainning  , overloading with Example using this keyword  */
 /** Question 2: ))   Access One Constructor call through another class Constructor using Super class with inheritance 
 inheritance must use otherwise we can't access any value of a variable */
 /**Question 2:))  Write a java  oops    inheritance program  with suitable example ,  here I explain single inheritance with Multiple Constructor method. 
 */
  class ConstructorCall{
     ConstructorCall(){
         System.out.println(" Constructor call using super class ");
     }
 }
 //  here i  create  single inheritance using extends keyword 
public class Constructor  extends ConstructorCall   {
	Constructor(){
	    super();// here call Constructor of another class Constructor  using super  class 
	    System.out.println(" Yes I'm default Constructor.");
	}
	Constructor(int a, int b){
	    this();// here I Create Constructor channing using this() keyword 
	    
	    System.out.println(" Yes I'm Parameterize Constructor, \n Now  here I perform Addition of a two number:");
	    System.out.println(" addition is :" +  (a+b));
	}
	Constructor( String name, int a, int b){
	    this(a, b);
	    System.out.println(" Yes I'm passing Multiple Parameterize  Constructor & \n   Now here I perform Your name & Multiplecation of a two number ");
	    System.out.println("  your name is :"+ name );
	    System.out.println( " Multiplecation is :" + (a*b)) ;
	}
	
	public static void main(String[] args) {
		Constructor object =new Constructor ("Mahadeb",5,6); // here I  Passed Multiple arguments 
		
	}
}
