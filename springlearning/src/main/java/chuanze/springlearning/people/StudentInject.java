package chuanze.springlearning.people;

public class StudentInject {
	private Student student;

	public Student getStudent() {
		return student;
	}

	public StudentInject(Student student) {
		this.student = student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	public void Say() {
		this.student.Say();
	}
}
