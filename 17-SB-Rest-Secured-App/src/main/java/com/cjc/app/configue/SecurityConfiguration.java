package com.cjc.app.configue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception
	{
		
		http.authorizeHttpRequests()
			.antMatchers("/student").authenticated()
			.antMatchers("/employee").authenticated()
			.antMatchers("/admin").authenticated()
			.antMatchers("/welcome").permitAll()
			.antMatchers("/home").permitAll()
			.and()
			.formLogin()
			.and()
			.httpBasic();
		
		return http.build();
	}
	
	
}
