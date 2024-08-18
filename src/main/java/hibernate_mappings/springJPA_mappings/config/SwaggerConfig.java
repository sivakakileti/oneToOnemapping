package hibernate_mappings.springJPA_mappings.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi controllerApi() {
        return GroupedOpenApi.builder()
                .group("rest-api")
                .packagesToScan("hibernate_mappings.springJPA_mappings")
                .build();
    }



}