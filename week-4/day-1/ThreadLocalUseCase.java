//ThreadLocal usecase:1 web server request
//we have fourse services and each service want to know which use made a request
//so 1st option is:- pass user to one service to another service
//2nd option :- create a map 1st service put a user in map and all other access that
//if we have multiple request and each request handle by speerate map then lock require for safe access
// if we use threadLocal insted of map is actually calling get and it automatically return that user to the thread
//so using thread local threr is no sync is required and we dont pass use from one service to another..
//Images:-ThreadLocalUseCase-1,ThreadLocalUseCase-2,ThreadLocalUseCase-3

//NOTE:-important to cleanup once jov is over
//je bhi process karyu hoy ene clean up karvu pade lasr service
//ThreadLocal have method of remove for this cleaup process remove() method is their
//UserContextHolder.holder.remove();

class UserContextHolder{
    public static ThreadLocal<User> holder=new ThreadLocal<>();
}
class Service1{
    public void process(){
        //set is for this thread and next services use that
        //wherever threadlocal retrive the use then we set that it into particular threadlocal
        //previous we know inital value and we pass in and use but ama kasu khaber nathi so first we
        //retrive then set and using that static ThreadLocal<User> holder access all other services

       // User user=getUser();
       // UserContextHolder.holder.set(user);
    }
}
class Service2{
    public void process(){
        User user=UserContextHolder.holder.get();
        //process user
    }
}class Service3{
    public void process(){
        User user=UserContextHolder.holder.get();
        //process user
    }
}class Service4{
    public void process(){
        User user=UserContextHolder.holder.get();
        //process user
        //cleaup
        UserContextHolder.holder.remove();
    }
}




public class ThreadLocalUseCase {
    public static void main(String[] args) {

    }
}