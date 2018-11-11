package mum.swe.democrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan("mum.swe.democrud")
public class DemocrudApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DemocrudApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(DemocrudApplication.class);
	}

}
