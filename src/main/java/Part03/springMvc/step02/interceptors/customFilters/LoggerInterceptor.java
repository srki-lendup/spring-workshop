package Part03.springMvc.step02.interceptors.customFilters;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoggerInterceptor implements HandlerInterceptor{

    private static Logger LOG = LoggerFactory.getLogger(LoggerInterceptor.class);

    @Override
    public boolean preHandle( HttpServletRequest request,
                              HttpServletResponse response,
                              Object handler) throws Exception {

        LOG.info("[preHandle]" +
                "[Thread:]"+Thread.currentThread().getName()+
                "[" + request + "]"+
                "[" + request.getMethod() + "]" +
                request.getRequestURI() );
        return true;
    }

    @Override
    public void postHandle( HttpServletRequest request,
                            HttpServletResponse response,
                            Object handler,
                            ModelAndView modelAndView) throws Exception {
        LOG.info("[postHandle]" +
                "[Thread:]"+Thread.currentThread().getName()+
                "[" + request + "]"
        );
    }

    @Override
    public void afterCompletion(
            HttpServletRequest request, HttpServletResponse response,Object handler, Exception ex)
            throws Exception {
        LOG.info("[afterCompletion]" +
                "[Thread:]"+Thread.currentThread().getName()+
                "[" + request + "]" +
                "[exception: " + ex + "]"
        );
    }
}
