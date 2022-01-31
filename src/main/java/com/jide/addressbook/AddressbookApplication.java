package com.jide.addressbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotations.Bean;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
@EnableSwagger2
public class AddressbookApplication {
	public static void main(String[] args) {
		SpringApplication.run(AddressbookApplication.class, args);
	}

	@Bean
	public Docket apiInfor(){
		return new Docket(DocumentationType.SWAGGER2).select()
			.apis(RequestHandlerSelectors.basePackage("com.jide.addressbook")).build();
	}

}
