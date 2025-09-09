package OneToOneMapping;

import FirstHibernateProgram.FetchDemo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();


        //creating question
        Question q=new Question();
        q.setQuestionId(1012);
        q.setQuestion("what is einfochips");

        Answer answer=new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("one kind of MNC comapany");
        q.setAnswer(answer);
        answer.setQuestion(q);

        Session session=factory.openSession();

        Transaction tx=session.beginTransaction();
        session.persist(answer);
        session.persist(q);

        tx.commit();
        session.close();
        factory.close();




    }
}
