package br.com.fiap.futuroverde.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class DocumentationConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("FuturoVerde API")
                    .description("Uma Api para o sistema da aplicação Futuro Verde.")
                    .summary("Api para gerenciamento da aplicação Futuro Verde, que realiza cadastro, listagem, exclusão de usuários e receitas.")
                    .version("V1")
                    .contact(new Contact()
                        .name("Yasmin Dias")
                        .email("yasmincd103@gmail.com")
                    )
                    .license(new License()
                        .name("MIT Open Source")
                        .url("http://futuroverde.com/licenca")
                    )
                )
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer")
                                        .bearerFormat("JWT")));

    }

}
