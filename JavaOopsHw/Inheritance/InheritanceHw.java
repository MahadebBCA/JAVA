
/** Question 4:)) explain Hierarchical inhertance with example */
/** Question 5:)) Explain Multilevel inheritance with same example */

class  Inheritance {
    void Display(){
        System.out.println("  yes, I'm Hierarchical  inheritance Base class \n  ");
    }
}

class Derived extends  Inheritance  {
    void Displays(){
        System.out.println("  Yes I'm  Derived class of base class Inheritance  \n ");
    }
}

class Derived2 extends Inheritance {
    void Display1(){
        System.out.println(" yes I'm second  Derived class  of base class inheritance \n");
    }
}

class BaseDerived  extends Derived {
    void Multilevel (){
        System.out.println(" yes I'm Multilevel inheritance of base class Derived \n which is inherited by another base class \n  of inheritance  base class. ");
    }
}

public class HierarchicalInheriEx {

    public static void main(String[] args) {
       Derived obj=new Derived();
       obj.Display();
       obj.Displays();

        Derived2 obj2 =new Derived2();
        obj2.Display();
        obj2.Display1();
        
        BaseDerived object=new BaseDerived ();
        object.Display();
        object.Displays();
        object.Multilevel();
        
    }
}
