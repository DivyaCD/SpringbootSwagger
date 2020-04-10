package com.swaggerdemo.springbootApp.swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerAPIDocumentationConfig {
    ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("User REST CRUD operations API in Spring-Boot")
                .description(
                        "Sample REST API for integrating Swagger ")
                .termsOfServiceUrl("").version("0.0.1-SNAPSHOT").contact(new Contact("Divya C D", "https://github.com/DivyaCD/SpringbootSwagger", "https://github.com/DivyaCD")).build();
    }
    @Bean
    public Docket configureControllerPackageAndConvertors() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.swaggerdemo.springbootApp")).build()
                .directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }
}

