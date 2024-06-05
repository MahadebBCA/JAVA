//explain abstract class in java 
abstract class greeting {
	 abstract void greet();
	public void greeting(){
		System.out.println("Hii i am abstract class ");
	}
}
class greets extends greeting{
	public void greet(){
		System.out.println("hello i am a sub class using abstract method contain ");
	}
}
// explain interface in java 
interface play{
    void plays();
    // this is interface body 
   //here we can not define body 
   //interface only  contain method 
}
class cricket implements play{
    public void plays(){
        System.out.println("there are 10 teams plays cricket in  TATA IPL ");
  //       public void plays(){
//        System.out.println("there are 10 teams plays cricket in  TATA IPL ");
//        we can not use multiple time of define interface method only one time can use it .
    }
}
class football implements play{
    public void plays(){
        System.out.println("there are 13 teams plays  football in Hero ISL");
    }
}
public class InterfaceHw{
    public  static void main(String []args){
        cricket obj =new cricket();
        obj.plays();
        football obj2=new football();
        obj2.plays();
        greets obj3 =new greets();
        obj3.greet();
        obj3.greeting();
        
    }
}
