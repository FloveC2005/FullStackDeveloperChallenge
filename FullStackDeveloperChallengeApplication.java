package com.example.fullstackdeveloperchallenge;

import com.vaadin.flow.spring.VaadinApplicationConfiguration;
import com.vaadin.flow.spring.security.VaadinWebSecurityConfigurerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@SpringBootApplication
public class FullStackDeveloperChallengeApplication extends VaadinWebSecurityConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(FullStackDeveloperChallengeApplication.class, args);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        super.configure(http);
    }

}
