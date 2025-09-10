package FetchTechnique;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

//on demand call thase Question Answer banne table che and QAUESTION ni under Answer we store as a list
//so jyare Question obj fetch karsu toh onlu que no j object avse jyare we fetch ans.size() or any other method tyare j e call lagse
public class LazyLoading {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        //make object of Question and call that Question and see in console hibernate call only Questoin Table or also call Answer table
      /*  Que q1=new Que();
        q1.setQuestionId(121);
        q1.setQuestion("what is java");

        //make object of Answer and set those ans in quesitons and fetch after
        Ans ans1=new Ans();
        ans1.setAnswerId(142);
        ans1.setAnswer("java is a programming language");

        Ans ans2=new Ans();
        ans2.setAnswerId(143);
        ans2.setAnswer("java is a programming language");

        Ans ans3=new Ans();
        ans3.setAnswerId(144);
        ans3.setAnswer("java is a programming language");

        List<Ans> ansList=new ArrayList<>();
        ansList.add(ans1);
        ansList.add(ans2);
        ansList.add(ans3);

        q1.setAnswers(ansList);

*/
        //make object if
        Session session=factory.openSession();
        Transaction trx=session.beginTransaction();

        //session.persist(q1);



        Que q= session.find(Que.class,121); //so by default hibernate Lazy Loading kare ahiya apde khali question j fecth karyo che ans nu kasu
                                                //kasu karyu nathi so answer table ne call nai lage but if
        System.out.println(q.getQuestion());

        //then aa kasrsu then have database ans table ne call lagse ...
        //so jova mate ek varr comment karine query jovi niche ni line ne ek varr uncomment karine
        //System.out.println(q.getAnswers());;



        trx.commit();
        session.close();
        factory.close();


    }

}
