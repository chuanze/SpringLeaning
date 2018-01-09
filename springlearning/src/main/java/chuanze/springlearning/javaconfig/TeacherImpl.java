package chuanze.springlearning.javaconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chuanze.springlearning.people.Teacher;
@Configuration
public class TeacherImpl {
	@Bean(name="Teacher")
	public Teacher teacherImpl() {
		return new Teacher();
	}
}
