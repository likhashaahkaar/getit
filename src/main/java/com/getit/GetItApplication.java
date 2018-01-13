package com.getit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@SpringBootApplication
@EnableResourceServer
public class GetItApplication extends ResourceServerConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(GetItApplication.class, args);
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		//security will be later included
		/*http
	    .authorizeRequests()
	    .antMatchers("/api/signup/**").permitAll()
	    .anyRequest().authenticated();*/
		
		http
	    .authorizeRequests()
	    .antMatchers("/api/**").permitAll();
		super.configure(http);
	}
}
