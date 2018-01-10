package com.cjzheng.authclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Created by CJ Zheng on 2018/1/5.
 * Project: auth-client
 */
@EnableWebMvc
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/")
                .setViewName("forward:/index");

        registry.addViewController("/index");
        registry.addViewController("/secure");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resource/**")
                .addResourceLocations("/resource/");
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public RequestContextListener requestContextListener(){
        return new RequestContextListener();
    }
}
