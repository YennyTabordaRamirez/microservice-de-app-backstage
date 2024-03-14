/*
package com.appoiments.config;

import java.util.Collections;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis((Predicate<RequestHandler>) RequestHandlerSelectors.any())
                .paths((Predicate<String>) PathSelectors.any()).build().apiInfo(getInfoApi());
    }

    private ApiInfo getInfoApi() {
        return new ApiInfo("API for laboratory tests",
                "This API it allows to users  to use the app.", "1.0.0", "https://laboratory.com.co",
                new Contact("Yenny Taborda Ramírez", "https://laboratory.com.co", "tarayenny@gmail.com"), "License",
                "https://heinsohn.com.co/license", Collections.emptyList());
    }

}

*/
