package med.voll.api;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SwaggerConfig {

    @Bean
    @Primary
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title( "API Vollmed")
                        .version("v1")
                        .description("Spring + java 17 + MySql\n\n"+
                        "**Login Obrigatório**\n\n"+
                                        "{\n\n" +
                                        "    \"login\": \"admin@voll.med\",\n" +
                                        "    \"senha\": \"admin\"\n\n" +
                                        "}"
                                )
                );
    }
}
