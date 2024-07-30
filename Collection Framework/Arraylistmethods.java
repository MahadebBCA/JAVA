//Collections framework  ArrayList classes all methods implementations here ::

import java.util.ArrayList;
import java.util.Collections;
public class Main {
  public static void main(String[] args) {
   
     ArrayList<String> Friends = new ArrayList<String>();
    Friends.add("Mahadeb");
    Friends.add("Jayanta");
    Friends.add("Debotosh");
    Friends.add("Satish");
  //  System.out.println(Friends);
    Friends.add(1,"Tilak");
    System.out.println(Friends);
    //using for loop 
    for (int i = 0; i < Friends.size(); i++) {
   //   System.out.println(Friends.get(i));
    }
    
    
 //   System.out.println(Friends.get(3));
    System.out.println(Friends.set(4,"Tuhin"));
  //  System.out.println(Friends);
    Friends.remove(2);
  //  System.out.println(Friends);
  //  System.out.println(Friends.size());
    //for each loop
    for(String i : Friends){
    //	System.out.println(i);
    }
    
//    Friends.clear();
  //  System.out.println(Friends);
   
    Collections.sort(Friends);
    //for each loop
    for(String i : Friends){
    	System.out.println(i);
    }
    
    ArrayList<String> CollageFriends = new ArrayList<String>();
    CollageFriends.add("Dipanjan");
    CollageFriends.add("debanjan");
    CollageFriends.add("anjan");
    System.out.println(CollageFriends);
    //use addAll method
    CollageFriends.addAll(Friends);
    System.out.println(CollageFriends);
    //use clone method pf ArrayList 
    ArrayList  Friends2= (ArrayList)Friends.clone();
    Friends.set(0, "Anjali");
    System.out.println(Friends);
    System.out.println(Friends2);
    //contains method 
    System.out.println(Friends.contains("Mahadeb"));
    System.out.println(Friends.indexOf("Mahadeb"));
    
    
    
    
  }
                       }
