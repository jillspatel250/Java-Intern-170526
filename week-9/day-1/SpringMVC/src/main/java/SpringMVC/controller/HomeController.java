package SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/first")
public class HomeController {

    @RequestMapping("/")
    public String Root(){
        System.out.println("welcome file..");
        return "Contact";
    }

    @RequestMapping(path="/home",method= RequestMethod.GET)
    public String Home(Model model){
        System.out.println("this is home url");

        //now one data add in model and we get that data in servlet Request jyare koi /home fire karse toh req jode aa bhi jase j..
        model.addAttribute("name","Jills Patel");
        model.addAttribute("id",170526);

        List<String> friends=new ArrayList<String>();
        friends.add("parthiv");
        friends.add("dhyey");
        friends.add("ABC");
        model.addAttribute("friends_name",friends);

        return "index";
    }

    @RequestMapping("/about")
    public String About(){
        System.out.println("this is about url");
        return "about";
    }

    //services
    //help
    @RequestMapping("/help")
    public ModelAndView help(){
        ModelAndView modelAndView=new ModelAndView();

        //in this we set 2 thing first data je apde dynamically mokalvo che and view name
        //setting the data
        modelAndView.addObject("name","jills");
        modelAndView.addObject("company_name","einfochips");
        LocalDateTime now=LocalDateTime.now();
        modelAndView.addObject("time",now);
        List<Integer> marks=new ArrayList<Integer>();
        marks.add(12);
        marks.add(14);
        marks.add(15);
        modelAndView.addObject("marks",marks);
        //setting the view name
        modelAndView.setViewName("help2");

        return  modelAndView;

    }

}
