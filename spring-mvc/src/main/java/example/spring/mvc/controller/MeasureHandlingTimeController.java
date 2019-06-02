package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MeasureHandlingTimeController {
    @GetMapping("/measure")
    public String measureHandlingTime() {
        return "measureHandlingTime";
    }
}
