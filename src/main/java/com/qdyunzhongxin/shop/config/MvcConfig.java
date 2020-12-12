package com.qdyunzhongxin.shop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/dist/**").addResourceLocations("classpath:/templates/dist/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("classpath:/templates/plugins/");
//        registry.addResourceHandler("/pages/**").addResourceLocations("classpath:/templates/pages");
    }
}
