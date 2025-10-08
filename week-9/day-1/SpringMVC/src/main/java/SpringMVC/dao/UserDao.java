package SpringMVC.dao;


import SpringMVC.Model.User;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao {

    @Autowired
   private EntityManager entityManager;

    @Transactional
   public void saveUser(User user){
       this.entityManager.persist(user);
   }

}
