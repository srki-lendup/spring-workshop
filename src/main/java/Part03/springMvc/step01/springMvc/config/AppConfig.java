package Part03.springMvc.step01.springMvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan( basePackages = "Part03.springMvc.step01.springMvc" )
public class AppConfig {
}
