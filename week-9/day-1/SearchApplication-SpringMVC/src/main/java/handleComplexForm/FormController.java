package handleComplexForm;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class FormController {

    @RequestMapping("/complex")
    public String showForm(){
        return "complex_form";
    }

   /* @RequestMapping(path = "/handleform", method = RequestMethod.POST)
    public String formHandler(@RequestParam("name") String name,@RequestParam("id") String id,Model model){

        model.addAttribute("name",name);
        model.addAttribute("id",id);
        return "success";
    }
    */

    @RequestMapping(path = "/handleform", method = RequestMethod.POST)
    public String formHandler(@ModelAttribute Student student, BindingResult result){
        if(result.hasErrors()){//jo koi error hase toh pachu complex_form ma j pacha lai jaisu..
            return "complex_form";
        }
        System.out.println(student);
        System.out.println(student.getAddress());
        return "success";
    }
}
