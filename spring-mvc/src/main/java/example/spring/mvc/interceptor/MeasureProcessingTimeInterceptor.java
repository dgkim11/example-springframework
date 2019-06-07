package example.spring.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Spring MVC에서 제공하는 Interceptor를 구현한다. Interceptor는 HandlerInterceptor interface를 구현하면 된다.
 * preHandle은 Spring의 Handler로 요청을 넘기기 전에 호출되고 postHandle은 Handler 처리가 완료된 후 ModelAndView를 View로
 * 전달하기 전에 호출된다. postHandle의 경우에는 그래서 Controller 처리가 완료된 후의 ModelAndView를 파라미터로 받아서
 * 업데이트를 할 수가 있다. 여기 예제는 Handler의 처리 시간을 측정하는 예이다.
 */
public class MeasureProcessingTimeInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("MeasureProcessingTimeInterceptor is measuring " + request.getRequestURI());
        long startTime = System.nanoTime();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long endTime = System.nanoTime();
        long startTime = (Long)request.getAttribute("startTime");
        modelAndView.addObject("handlingTime", endTime - startTime);
        request.removeAttribute("startTime");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
