package com.rec.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:holder.properties")
public class AppConfig {

	@Autowired
	private Environment env;

	@Bean
	public Disc disc() {
		return new Disc(env.getProperty("title"));
	}

}
