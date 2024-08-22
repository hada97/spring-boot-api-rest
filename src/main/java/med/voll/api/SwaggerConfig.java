package med.voll.api;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title( "API do Ada em Produção")
                        .version("v1")
                        .description("API Rest desenvolvida no curso da escola Alura")
                );
    }
}
