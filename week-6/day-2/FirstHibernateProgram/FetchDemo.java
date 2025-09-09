package FirstHibernateProgram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    //we see example of get() or load()

    public static void main(String[] args) {

        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();

        //get method:- we konw student id:-
       Student student= session.find(Student.class,110);//we pass first entity type and id
        Student student1= session.find(Student.class,110);
        //apde 2 varr find call karyu che but database call toh ek j thase and e data session cache ma store thai
        //rehse and ej pachi madse so we see in output ek j varr query fire thase

        System.out.println(student);

       // Address address=session.find(Address.class,1);
        //Address address1=session.find(Address.class,1);

        //load ma call nai thayy database ne proxy object return thase
        //Address address=session.load(Address.class,103);
        // Address address=session.load(Address.class,103);

        //jyare apde obj ni method call karsu tyare actual database call thase
        //System.out.println(address.getName()); //now database call is happend in load method





        // System.out.println(address);

        session.close();
        factory.close();
    }

}
