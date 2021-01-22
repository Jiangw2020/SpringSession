package jw.spring.session.springsessionb.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HelloHandler {
    @RequestMapping("/test/spring/session/get")
    public String testSession(HttpSession session){
        Object king = session.getAttribute("king");
        return "从session域取出数据："+king.toString();
    }
}
