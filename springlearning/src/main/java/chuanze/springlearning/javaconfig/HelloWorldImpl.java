package chuanze.springlearning.javaconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chuanze.springlearning.springlearning.HelloWorld;
@Configuration
public class HelloWorldImpl {
	@Bean(name="HelloWorld")
	public HelloWorld hellWorld() {
		return new HelloWorld();
	}
}
