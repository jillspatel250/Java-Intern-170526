//3.anonymous innener class

abstract class my{
    abstract void Display();
}

//interface 
// interface my{
//     void display();
// }

public class Inner3 {
    
    public void meth(){
        //we make refrence of my class but we canoot make object of abstract class
        //but here we override the method and we define class in that
        //here we not create object we define anonymous object my(){//defination};
        //it means we define anonymous class which is implement that abstract class or interface
        my m=new my(){
            public void Display(){
                System.out.println("hello");
            }
        };
        m.Display();
    }
}
//why we use this :-
//when limited usge is their for that interface/abstract class so we not make 
//seperate class on that place we implement that class as a anonymous class