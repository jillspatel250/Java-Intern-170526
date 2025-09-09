package ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();

        //make Employee Object
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.setEid(333);
        e1.setName("Jillsssss");

        e2.setEid(1701);
        e2.setName("Priya1aa");

        //make Porject object

        Project p1=new Project();
        Project p2=new Project();
        p1.setPid(1212111);
        p1.setProjectName("Library Management System");

        p2.setPid(1421411);
        p2.setProjectName("CHATBOT");

        List<Employee> employeeList=new ArrayList<>();
        List<Project> projectList=new ArrayList<>();

        employeeList.add(e1);
        employeeList.add(e2);

        projectList.add(p1);
        projectList.add(p2);

        e1.setProjects(projectList);
        p1.setEmployees(employeeList);

        Session session=factory.openSession();
        Transaction trx=session.beginTransaction();

        session.persist(e1);
        session.persist(e2);
        session.persist(p1);
        session.persist(p2);


        trx.commit();
        session.close();
        factory.close();
    }
}
