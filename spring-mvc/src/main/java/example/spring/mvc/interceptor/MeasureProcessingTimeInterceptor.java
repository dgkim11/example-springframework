package example.spring.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Spring MVC에서 제공하는 Interceptor를 구현한다. 여기 예제는 Handler의 처리 시간을 측정하는 예이다.
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
