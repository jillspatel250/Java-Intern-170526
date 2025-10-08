package springSearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.ui.Model;
@Controller
public class SearchController {


        @RequestMapping("/user/{userId}/{userName}")
        public String getUserDetails(@PathVariable("userId") int uid,@PathVariable("userName") String username){
            System.out.println("User details Getting...");
            System.out.println("UID is: "+ uid + " U`sername is: "+ username);
            return "home";

        }

        @RequestMapping("/home")
        public String home(){
            System.out.println("going to home view");
            return "home";
        }

        @RequestMapping("/search")
        public RedirectView search(@RequestParam("querybox") String query){
            String url="https://www.google.com/search?q="+query;
            RedirectView redirectView=new RedirectView();
            System.out.println(url);
            redirectView.setUrl(url);
            return redirectView;
        }


}
