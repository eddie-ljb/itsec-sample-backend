package de.etiennebader.itsecbackend.config;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@OpenAPIDefinition(
        servers = {
                @Server(url = "http://88.151.194.71:8080/", description = "Local Server"),
                @Server(url = "http://localhost:8080/", description = "Localhost")
        }
)
public class SwaggerConfig {

    @Bean
    public OpenAPI api() {

        return new OpenAPI()
                .info(new Info().title("OnlineBanking Sample Engine")
                        .description("API test for OnlineBanking Sample Engine, which is the Backend of the webapp OnlineBanking Sample"));
    }

}

