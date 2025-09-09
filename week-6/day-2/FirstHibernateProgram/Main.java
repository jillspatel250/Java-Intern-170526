package FirstHibernateProgram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception{

        SessionFactory factory= new Configuration().configure().buildSessionFactory();


        //creating student
        Student st=new Student(); //after this line we run program then hibernate make table in database
        st.setId(110);
        st.setCity("Nadiad");
        st.setName("Dhyey");
        //System.out.println(st);


        //read the image:-
        FileInputStream fis=new FileInputStream("/Users/jillspatel/Desktop/IntelliJ/Hibernate-1/src/main/java/FirstHibernateProgram/image-1.png");
        byte[] data=new byte[fis.available()];
        fis.read(data);

        //creating address obj
        Address add1=new Address("Gota","Ahemdabad",true,1.2,new Date(),data);

        //table to object bane tyare j bani gayu now if we need to make operation save and all
        //so we need to mke session from facotry object then e session na help thi we perfrom operations


        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();//start the transaction amd this return current trx.

        session.persist(st);//obj is save in database
        session.persist(add1);
        //if we use hibernate 5 then for save save() method is their
        //if we use hibernate 6 then for save persist() method is their

        tx.commit();//commit the transaction
        session.close();

    }
}
