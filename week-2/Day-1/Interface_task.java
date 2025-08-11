interface Member
{
    void callback();
}
class Customer implements Member
{
    String name;
    public Customer(String name){
        this.name=name;
    }
    public void callback(){
        System.out.println("OK,I will visit "+name);
    }
}
class store{
    Member mem[]=new Member[100];//here we store object of customer in Member type interface so 
    //all mem[1],mem[2].. have access of callback() method and we define 
    int count=0;
    public void register(Member m){
        mem[count++]=m;
    }
    public void inviteSale(){
        for(int i=0;i<count;i++){
            mem[i].callback();
        }
    }
}

public class Interface_task {
    public static void main(String[] args) {
        store s=new store();
        Customer c1=new Customer("Jills");
        Customer c2=new Customer("Einfochips");

        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
    
}