// linkedList class are same as ArrayList class 
//so i define or implement some method in LinkedList  methods 
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    LinkedList<String> Friends = new LinkedList<String>();
    Friends.add("Bapan");
    Friends.add("Shuvra");
    Friends.add("Nilima");
    Friends.add("Tilak");
    System.out.println(Friends);
    Friends.addFirst("Gopu");
    Friends.addLast("Naran");
    System.out.println(Friends);
    LinkedList Friends2 = (LinkedList)Friends.clone();
    Friends2.set(0, "Madhurima");
    System.out.println(Friends2);
    
    System.out.println(Friends.isEmpty());
  }
}
