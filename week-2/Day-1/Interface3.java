class phone
{
    public void call(){
        System.out.println("Call...");
    }
    public void sms(){
        System.out.println("SMS...");

    }
}

interface camera{
    void Iclick();
    void Irecord();
}

interface musicplayer{
    void Iplay();
    void Ipause();
    void Istop();
}

class smartphone extends phone implements camera,musicplayer{

    
    public void Iplay() {
        System.out.println("smartphone play music");
        
    }

    public void Ipause() {
        System.out.println("smartphone pause playing music");
    
    }

    public void Istop() {
        System.out.println("smartphone stop playing music");
      
    }

    public void Iclick() {
       System.out.println("smartphone click photo");
    }

    public void Irecord() {
      System.out.println("smartphone record video");
    }
    
}
public class Interface3 {
    public static void main(String[] args) {
        smartphone sp=new smartphone();
        phone p=sp;//smartphonse is a phone ... we access only phone methods...
        camera c=sp;//smartphone is a camera.. we access only camera features..Because we are using refrence of camera .. 
        musicplayer m=sp;//samrtphpne is a musicplyer .. we access only musicplayer feature..
        sp.call();
        c.Iclick();
        //m.Irecord(); this is not aaceesible because m access only music player feature... 
    }
}