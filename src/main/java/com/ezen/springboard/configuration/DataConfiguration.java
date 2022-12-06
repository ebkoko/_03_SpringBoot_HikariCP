package com.ezen.springboard.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration // 설정파일임을 선언
@PropertySource("classpath:/application.properties") // classpath:/application.properties 파일을 읽어서 사용하겠다
public class DataConfiguration {
	
	@Bean // 거의 대부분 생성자 메소드 위에 선언
	// application.properties 파일의 어떤 내용을 읽어서 설정할지 선언
	@ConfigurationProperties(prefix="spring.datasource.hikari")
	public HikariConfig hikariConfig() {
		return new HikariConfig();
	}
	
	@Bean
	public DataSource dataSource() throws Exception {
		DataSource dataSource = new HikariDataSource(hikariConfig());
		return dataSource;
	}
}
