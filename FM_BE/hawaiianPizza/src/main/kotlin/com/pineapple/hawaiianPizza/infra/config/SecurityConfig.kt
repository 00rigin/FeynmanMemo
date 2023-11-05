package com.pineapple.hawaiianPizza.infra.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig() {
    @Bean
    @Throws(Exception::class)
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        return http.httpBasic().disable()
            .cors()
            .and()
            .csrf { it.disable() }
            .headers { it.frameOptions() }
            .headers { it.disable() }
            .sessionManagement { it.sessionCreationPolicy(SessionCreationPolicy.STATELESS) }
            .authorizeRequests {
                it.antMatchers(
                    "/api-docs/**", "/health", "/swagger-ui.html",
                    "/swagger-ui/**", "/v3/api-docs/**", "/actuator/**", "/memo/**"
                )
                    .permitAll()
                    .anyRequest().authenticated()
            }
            .formLogin { it.disable() }
            .logout { it.disable() }
            .build()
    }

}