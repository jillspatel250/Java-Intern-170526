package Generic;

//so aa contriner variable darr vakhate alag alag rete kam karse object creation
// time e apde <String> e varr lakhi dese toh eni under string j accept..
// so apde ek varr je lakhi dedhu ej type apvu padse so it give type safety...
//example in Code1 file we have two object box(type string) and box1(type int)
// if we write this box1.container="helllo world" so it give error because it expect int so it give 
// compile time check type 
public class Box<T> {
    T container;
    public Box(T container){
        this.container=container;
    }
    public Object getValue(){
        return this.container;
    }
    public void perfromSomeTask(){
        if(container instanceof String){
            System.out.println("length string is "+((String) this.container).length());
        }
        if(container instanceof Integer){
            System.out.println("Value is "+container);
        }
    }
}
