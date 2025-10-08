package Interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("this is prehandler...");
        //IN THIS if name is not Start with J then only request agad forward thase baki ahiya thi j pachi reuqest mokli desu user ne
        String username=request.getParameter("user");
        if(username.startsWith("J")){
            response.setContentType("text/html");
            response.getWriter().println("<h1>this is invalid name ... name should not start with J</h1>");
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("this is Post handler....");
    }


    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("this is PostCompletion handler");
    }
}
