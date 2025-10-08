package ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
    //here we produce null pointer exception and see how we send view for that excpetion..

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NullPointerException.class)
    public String exceptionHandlerNull(Model m){
        m.addAttribute("msg","Null Pointer Exception has occured!!!");
        return "exception_page";
    }

    //@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = NumberFormatException.class)
    public String exceptionHandlerNumberFormat(Model m){
        m.addAttribute("msg","Number Format Exception has occured!!!");
        return "exception_page";
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler( value = Exception.class)
    public String GeneralException(Model m){
        m.addAttribute("msg","Exception has occured!!!");
        return "exception_page";
    }
}
