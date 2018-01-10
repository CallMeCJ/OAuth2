package com.cjzheng.authclient.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by CJ Zheng on 2018/1/5.
 * Project: auth-client
 */
@EnableOAuth2Sso
@Configuration
public class OAuthConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/","/login**")
                .permitAll()
                .anyRequest().authenticated();
    }
}
