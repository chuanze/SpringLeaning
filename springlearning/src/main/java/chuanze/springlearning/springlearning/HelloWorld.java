package chuanze.springlearning.springlearning;

public class HelloWorld {
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public HelloWorld() {}
	public HelloWorld(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}

	public void HelloWorldPrint(String str)
	{
		System.out.println("Hello World "+str);
	}
}
