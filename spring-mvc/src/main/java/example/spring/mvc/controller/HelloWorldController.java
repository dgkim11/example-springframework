package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    /**
     * Hello World를 리턴하는 간단한 controller. 리턴값이 'hello'인데 이 의미는 View Resolver에게 view name이 'hello'
     * 임을 알려준다. View Resolver는 거기에 맞는 view file을 읽어서 렌더링을 한다. 본 예제에서는 View Resolver로
     * Handlebars를 이용하고 있기 때문에 hello.hbs 라는 파일이 view file이 된다.
     *
     * @param model
     * @return
     */
    @GetMapping("/hello")
    public String hello(Model model)   {
        model.addAttribute("hello_msg", "Hello World !!!");
        return "hello";
    }
}
