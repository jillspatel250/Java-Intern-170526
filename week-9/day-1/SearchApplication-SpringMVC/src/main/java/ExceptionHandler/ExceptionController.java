package ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ExceptionController {
    @RequestMapping(path = "/check1")
    public void check_null(){
        String s=null;
        System.out.println(s.length());
    }
    @RequestMapping(path = "/check2")
    public void check_number_format(){
        String num="einfochips";
        Integer.parseInt(num);
    }

    @RequestMapping(path = "/check3")
    public void generalException(){
        int arr[]=new int[10];
        System.out.println(arr[99]);
    }
//
//    //here we produce null pointer exception and see how we send view for that excpetion..
//
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(value = NullPointerException.class)
//    public String exceptionHandlerNull(Model m){
//        m.addAttribute("msg","Null Pointer Exception has occured!!!");
//        return "exception_page";
//    }
//
//    //@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(value = NumberFormatException.class)
//    public String exceptionHandlerNumberFormat(Model m){
//        m.addAttribute("msg","Number Format Exception has occured!!!");
//        return "exception_page";
//    }
//
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler( value = Exception.class)
//    public String GeneralException(Model m){
//        m.addAttribute("msg","Exception has occured!!!");
//        return "exception_page";
//    }
}
