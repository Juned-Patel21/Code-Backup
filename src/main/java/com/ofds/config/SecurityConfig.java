package com.ofds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
 
@Configuration
public class SecurityConfig {
 
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // Disabling CSRF protection (common for REST APIs)
        http.csrf(csrf -> csrf.disable());
 
        // Allowing all requests to any endpoint without authentication
        http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
 
        // Explicitly disable basic authentication and the login page
        http.httpBasic(basic -> basic.disable());
        http.formLogin(form -> form.disable());
 
        return http.build();
    }
}