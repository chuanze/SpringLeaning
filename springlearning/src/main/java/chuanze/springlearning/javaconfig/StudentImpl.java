package chuanze.springlearning.javaconfig;
import org.springframework.context.annotation.Configuration;

import chuanze.springlearning.people.Student;

import org.springframework.context.annotation.Bean;
@Configuration
public class StudentImpl {
	@Bean(name="Student")
	public Student studentImpl() {
		return new Student();
	}
}
