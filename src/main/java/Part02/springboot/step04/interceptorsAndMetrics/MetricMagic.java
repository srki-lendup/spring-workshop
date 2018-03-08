package Part02.springboot.step04.interceptorsAndMetrics;
/*
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.AsyncHandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
*/
public class MetricMagic /*implements WebMvcConfigurer, AsyncHandlerInterceptor*/ {
    /*private final Counter counter;

    @Bean
    MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
        return registry -> registry.config().commonTags("service-name", "Metric Service");
    }

    @Autowired
    public MetricMagic( MeterRegistry registry ) {
        this.counter = registry.counter("received.messages");
    }

    @Override
    public boolean preHandle( final HttpServletRequest request, final HttpServletResponse response, final Object handler ) throws Exception {
        return true;
    }

    @Override
    public void postHandle( final HttpServletRequest request, final HttpServletResponse response, final Object handler, @Nullable final ModelAndView modelAndView ) throws Exception {
        this.counter.increment();
    }

    @Override
    public void addInterceptors( InterceptorRegistry registry ) {
        registry.addInterceptor( this ).addPathPatterns( "**\/*" );
    }*/
}
