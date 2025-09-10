package ObjectStates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {
    public static void main(String[] args) {
        //practical of hibernate Object States:
        //transient
        //persistent
        //Detached
        //Removed
        System.out.println("Example:");

        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        //creating student obj
        Student student=new Student();
        student.setId(1414);
        student.setName("Peter");
        student.setCity("ABC");
        student.setCerti(new Certificate("Java Hibernate Course","2 Months"));
        //student: Transient (now currently we set obj property so that obj is in transient state)

        Session session=factory.openSession();
        Transaction trx=session.getTransaction();
        session.persist(student);
        //student : Persistent - because now it obj is associated with session and database
        //now we change student name means after saving
        student.setName("John"); //so name have Peter na jagya per john dekhase database ma becaue e haji persistent state ma che toh banne ma change thase
        //so save pachi e apde name set karsu toh e database ma reflect thase

        trx.commit();

        session.close();
        //student : detached state //have database jode associated hase but session j bandh thai gayu toh database ma ey kai rete jase so database ma ey reflect nai thayy khali e assocaited hase em kehva
        //and detached state a hase toh session jode bhi associated nai j hoy
        student.setName("Jills");//so that is not reflect in database


        factory.close();
    }
}
