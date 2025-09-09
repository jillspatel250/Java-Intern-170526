package OneToManyMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        //creating Question
        Questions q1=new Questions();
        q1.setQuestionId(1212);
        q1.setQuestion("what is java");

        //creating Answer
        Answers ans1=new Answers();
        ans1.setAnswerId(324);
        ans1.setAnswer("with the helo of java we can create softwares");
        ans1.setQuestion(q1);

        //creating second ans for same quesiton
        Answers ans2=new Answers();
        ans2.setAnswerId(325);
        ans2.setAnswer("java ia a programming language");
        ans2.setQuestion(q1);

        //creating third ans for same quesiton
        Answers ans3=new Answers();
        ans3.setAnswerId(329);
        ans3.setAnswer("java ia a Object oriented");
        ans3.setQuestion(q1);

        List<Answers> list=new LinkedList<>();
        list.add(ans1);
        list.add(ans2);
        list.add(ans3);

        q1.setAnswers(list);

        Session session=factory.openSession();
        Transaction trx=session.beginTransaction();

        session.persist(q1);

        //fetching...
        Questions q=session.find(Questions.class,1212);
        System.out.println(q.getQuestion());

        for(Answers a:q.getAnswers()){
            System.out.println(a.getAnswer());
        }

        trx.commit();
        session.close();
        factory.close();
    }

    }

