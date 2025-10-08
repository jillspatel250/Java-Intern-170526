package SpringMVC.service;

import SpringMVC.Model.User;
import SpringMVC.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public void createUser(User user){
         this.userDao.saveUser(user);
    }
}
