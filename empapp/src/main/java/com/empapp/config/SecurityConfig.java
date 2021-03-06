package com.empapp.config;


import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("mani").password("{noop}mani369").roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.csrf().disable().
	            authorizeRequests().antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
	            .anyRequest().authenticated()
	            .and().httpBasic();
	}
}



	
 

