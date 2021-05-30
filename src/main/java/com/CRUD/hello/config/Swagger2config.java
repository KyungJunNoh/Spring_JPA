package com.CRUD.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

// Swagger을 사용하기위한 준비 클래스
@Configuration
@EnableSwagger2 //swagger을 사용하기 위한 어노테이션
public class Swagger2config {
    @Bean
    public ApiInfo apiInfo() {

        return new ApiInfoBuilder()
                .title("Demo")
                .description("API EXAMPLE")
                .build();
    }

    @Bean
    public Docket commonApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("example")
                .apiInfo(this.apiInfo())
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.CRUD.hello.controller"))
                .paths(PathSelectors.ant("/api/**"))
                .build();
    }


}
