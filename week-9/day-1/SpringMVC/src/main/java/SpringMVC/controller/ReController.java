package SpringMVC.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.Arrays;

@Controller
public class ReController {


    /*
    @RequestMapping("/one")
    public String one(){
        System.out.println("this is first handler");
        return "redirect:/enjoy"; //now when request is in /one then e after that all process enjoy per redirect thai jase
        //so example if we need to throw errror page or success page after some processing or some filed if we knoe error avi sake
        //so in that case we redirect to that route directly..
    }
     */

    @RequestMapping("/one")
    public RedirectView one(){
        System.out.println("this is first handler");
        RedirectView redirectView=new RedirectView();
        // redirectView.setUrl("https://www.google.com");
        redirectView.setUrl("enjoy");
        return redirectView;
    }

    @RequestMapping("/enjoy")
    public String two(){
        System.out.println("this is second handler");
        return "contact";
    }

}
