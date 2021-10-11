package za.ac.nwu.ac.web.sb;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import za.ac.nwu.domain.persistence.Entity;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Account System PI", version = "2.0", description = "Account System Information"))
public class RestServiceApplication {

    public static void main(String [] args) {
        SpringApplication.run(RestServiceApplication.class, args);}
}
