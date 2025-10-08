package Interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
//in this we make controller ke je hit thayy ena pehla interceptors and ena pachi e based on implementation
//interceptors chalva joiee
@Controller
public class Contollers {
    @RequestMapping("/start")
    public String home() {
        return "start";
    }


    //so apde aa /welcome per request jay ena pehla interceptor lagaai ne kam karvanu che and ena pachi
    //e apde posthandler lagavanu che but our point ke /welcome per apde interceptors lagadvana che
    @RequestMapping(path="/welcome",method = RequestMethod.POST)
    public String welcome(@RequestParam("user") String name, Model m) {
        System.out.println(name);
        m.addAttribute("name",name);
        return "welcome";

    }
}
