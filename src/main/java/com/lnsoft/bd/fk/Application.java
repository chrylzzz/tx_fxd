package com.lnsoft.bd.fk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lnsoft.bd.fk.mapper")
public class Application {/*extends SpringBootServletInitializer
{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return builder.sources(Application.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(Application.	class, args);
	}
}
