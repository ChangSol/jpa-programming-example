package org.changsol.configs.swagger;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Swagger View Config Class
 */
@Component
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI(@Value("${springdoc.version}") String appVersion) {
        Info info = new Info()
                .title("Changsol JPA-Programming Example API")
                .version(appVersion)
                .description("창솔 JPA 프로그래밍 예제 서비스에 오신걸 환영합니다.😁")
                .contact(new Contact().name("changsol-github").url("https://github.com/ChangSol"))
                .license(new License().name("Apache License Version 2.0").url("https://www.apache.org/licenses/LICENSE-2.0"));

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}
