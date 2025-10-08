package SpringMVC.controller;

import SpringMVC.Model.User;
import SpringMVC.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void commonDataForModel(Model m){
        m.addAttribute("Header","Jills einfochips");
        m.addAttribute("Desc","1 Year Internship");
        System.out.println("Adding common data to model");

    }

    @RequestMapping("/contact")
    public String showForm(){
        System.out.println("Creating forms");
        return "contact";
    }

    //form submit aa path per thayy che and e post method che so here we also define post method ..

    /*this is old method we use in servlet to get parameter or attribute
    public String processForm(HttpServletRequest request){
        String name=(String)request.getParameter("userName");
        String password=(String)request.getParameter("userPassword");
        String email=(String)request.getParameter("email");
        System.out.println(name + " "+ password + " "+email);
        System.out.println("Process Form is calling..");
        return "about";
    }
    we use now annotation using that we get parameter
     */

    //so here we fetch data from view je view mathi avse using  RequestParam annotation and
    //process that data and send it to success view.. so
    //take view -> controller -> view...

    /*
    @RequestMapping(path="/processform",method = RequestMethod.POST)
    public String handleForm(@RequestParam("email") String Useremail,
                             @RequestParam("userName") String username,
                             @RequestParam("userPassword")String userpassword , Model model){
        System.out.println("email is "+Useremail + " "+"name is "+ username + " "+ "password is" + userpassword);

        //process the data

        model.addAttribute("email",Useremail);
        model.addAttribute("username",username);
        model.addAttribute("password",userpassword);

        return "success";

    }
     */

    //here we use @ModelAttribute annotation to fetch data je view mathi ave che
    //diff?? @RequestParams and @ModelAttribute?
    //@RequestParams ek ek karine levi padse attribtue ne
    //@RequestParam → pick values one by one.
    //@ModelAttribute → pick whole form as one object (Spring does binding automatically).

    @RequestMapping(path = "processform" , method = RequestMethod.POST)
    //so modelAttribute su karse je bhi forms avtu hase ene user ni filed jode bind kari dese .. means mathc karine ema muki dese kind of that
    public String handleForm(@ModelAttribute User user,Model model){
        System.out.println(user);
        //process
        if(user.getUserName().isEmpty()){ //jo username empty hase toh pachu j e form ma redirect kari dese..
            return "redirect:/contact";
        }
        this.userService.createUser(user);
        model.addAttribute("msg","User created Successfully");
        return "success";
    }

    //So here magic is there only we use one line @ModelAttribute User user e badhu kam kari ledhu
    //forms mathi badhi filed fetch kari ledhi .. ene User model ma ek ek karine save kari dedhi
    //so aode kasu set karvani ne get karvani kasu magaj mari nai
    //and pachi apde ene success view ma use karyu so thats the magic of the @ModelAttribute
}
