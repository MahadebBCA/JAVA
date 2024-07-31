import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Main {
	public static void main(String[] args) {
		//Stack methods 
		System.out.println("Stack methods implementations of collection frameworks ");
		Stack<String> name = new Stack<>();
		 name.push("Mahadeb");
		 name.push("Jayanta");
		 System.out.println(name);
		System.out.println(name.peek());
		System.out.println(name.pop());
		name.push("debotosh");
		System.out.println(name);
	 	System.out.println(name.isEmpty());
	 	System.out.println(name.size());
		
		 name.push("tilak sen");
		 System.out.println(name);
		 
		 //Queue methods 
		System.out.println("queue methods implementations of collection frameworks ");
		 Queue<String> name2 =new LinkedList<>();
		  name2.offer("Mahadeb");
		  name2.offer("Madhurima");
		  System.out.println(name2);
		 System.out.println(name2.poll());
		 System.out.println(name2);
		 System.out.println(name2.remove());
		 System.out.println(name2);
		 name2.offer("sahadeb");
		  name2.offer("nilima");
		 System.out.println(name2.element());
		 name2.offer("debatosh");
		  name2.offer("Debasmita");
		  System.out.println(name2.peek());
		  System.out.println(name2.poll());
		  System.out.println(name2);
		  
		  //PriorityQueue methods 
		 System.out.println("PriorityQueue methods implementations of collection frameworks ");
		  PriorityQueue<Integer> num = new PriorityQueue<>();
		  num.offer(45);
		  num.offer(57);
		  num.offer(23);
		  num.offer(86);
		  System.out.println(num);
		  System.out.println(num.poll());
		  System.out.println(num);
		  System.out.println(num.peek());
		  System.out.println(num);
		  
		  // both queue & priorityQueue methods are same 
		  //ArrayDequeue methods 
		 System.out.println("ArrayDeque methods implementations of collection frameworks ");
		  ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(45);
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() " +adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " +adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " +adq);
		  
		  //set methods 
		  
		 // Set<Integer> set = new HashSet<>();
      //  Set<Integer> set = new LinkedHashSet<>();
System.out.println("Set methods implementations of collection frameworks ");
      Set<Integer> set = new TreeSet<>();

     set.add(32);
             set.add(2);
       set.add(54);
       set.add(21);
     set.add(65);

      System.out.println(set);

    set.remove(54);
     System.out.println(set);

     System.out.println(set.contains(21));
      System.out.println(set.isEmpty());
       System.out.println(set.size());  
      set.clear();

     System.out.println(set);

		  
	}
  }
