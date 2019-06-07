package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 이 예제는 Interceptor를 이용해서 handler의 처리 시간을 측정하는 예이다.
 */
@Controller
public class MeasureHandlingTimeController {
    @GetMapping("/measure")
    public String measureHandlingTime() {
        return "measureHandlingTime";
    }
}
