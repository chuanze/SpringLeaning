package chuanze.springlearning.javaconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
@Import({StudentImpl.class,TeacherImpl.class})
public class PeopleImpl {

}
