package dispensaryspring.example.dispensaryspring.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalCorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Applies to all paths
                .allowedOrigins("http://localhost:4200")  // Allows the Angular frontend to access
                .allowedMethods("GET", "POST", "PUT", "DELETE", "PATCH", "OPTIONS")  // Methods allowed
                .allowedHeaders("*")  // Allows all headers
                .allowCredentials(true);  // If you need to allow cookies or authorization headers
    }
}
 
