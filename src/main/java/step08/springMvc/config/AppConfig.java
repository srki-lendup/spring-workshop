package step08.springMvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan( basePackages = "step08.springMvc")
public class AppConfig {
}
