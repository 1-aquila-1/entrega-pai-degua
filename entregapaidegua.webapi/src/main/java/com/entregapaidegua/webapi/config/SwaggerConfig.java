package com.entregapaidegua.webapi.config;


import com.entregapaidegua.entity.Usuario;
import com.entregapaidegua.webapi.controller.EmpresaController;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
@ComponentScan(basePackageClasses = {
    EmpresaController.class
})
public class SwaggerConfig {

    @Bean
    public Docket forumApi() {
        return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .paths(PathSelectors.any())
        .build()
        .ignoredParameterTypes(Usuario.class)
        .apiInfo(metaInfo());
    }
    
    private ApiInfo metaInfo() {
        return new ApiInfoBuilder()
        .title("Entrega Pai D'egua")
        .description("Serviço do APP para entrega de produtos em geral ")
        .version("1.0")
        .contact(new Contact("Entrega Pai D'egua", "www.entregapaidegua.com", "")).build();
    }

}
