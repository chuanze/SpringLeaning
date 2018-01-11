package chuanze.springlearning.springlearning;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import chuanze.springlearning.javaconfig.HelloWorldImpl;
import chuanze.springlearning.javaconfig.PeopleImpl;
import chuanze.springlearning.people.CustomerCollection;
import chuanze.springlearning.people.Student;
import chuanze.springlearning.people.StudentInject;
import chuanze.springlearning.people.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PrintFormat("HelloWorld实例");
    	ApplicationContext hwContext=new FileSystemXmlApplicationContext("xmlconfig/HelloWorld.xml");
    	HelloWorld hw=(HelloWorld)hwContext.getBean("HelloWorld");
    	hw.HelloWorldPrint("Spring");
    	PrintFormat("HelloWorld通过javaconfig加载");
    	ApplicationContext hwContext2=new AnnotationConfigApplicationContext(HelloWorldImpl.class);
    	HelloWorld hw2=(HelloWorld)hwContext2.getBean("HelloWorld");
    	hw2.HelloWorldPrint("Spring");
    	PrintFormat("@Import实例之javaconfig");
    	ApplicationContext context3=new AnnotationConfigApplicationContext(PeopleImpl.class);
    	Student student=(Student)context3.getBean("Student");
    	student.Say();
    	Teacher teacher=(Teacher)context3.getBean("Teacher");
    	teacher.Say();
    	PrintFormat("@Import实例之xmlconfig");
    	ApplicationContext context4=new FileSystemXmlApplicationContext("xmlconfig/People.xml");
    	Student student2=(Student)context4.getBean("Student");
    	student2.Say();
    	Teacher teacher2=(Teacher)context4.getBean("Teacher");
    	teacher2.Say();
    	PrintFormat("Spring 注入方式:注入方式有两种，一种是通过setter方法，一种是通过构造方法");
    	PrintFormat("构造方法注入方式");
    	ApplicationContext context5=new FileSystemXmlApplicationContext("xmlconfig/People.xml");
    	StudentInject studentInject=(StudentInject)context5.getBean("StudentInjectCon");
    	studentInject.Say();
    	PrintFormat("Setter注入方式--该方法需要默认的构造函数");
    	StudentInject studentInject2=(StudentInject)context5.getBean("StudentInjectPro");
    	studentInject2.Say();
    	PrintFormat("构造方法注入类型歧义");
    	System.out.println("构造核函数相同的时候，到底调用那个构造函数");
    	System.out.println("主要是通过在配置构造函数中配置入参类型");
    	Student student3=(Student)context5.getBean("StudentImpl");
    	System.out.println(student3.toString());
    	PrintFormat("在Spring中，三种方式注入值到bean中：");
    	System.out.println("=>正常模式");
    	System.out.println("=>快捷模式");
    	System.out.println("=>p模式");
    	PrintFormat("内部bean实例：");
    	System.out.println("=>ref");
    	System.out.println("=>内部bean");
    	PrintFormat("Spring集合 map List Set Map Properties实例");
    	ApplicationContext context6=new FileSystemXmlApplicationContext("xmlconfig/CustomerCollection.xml");
    	CustomerCollection cus=(CustomerCollection)context6.getBean("CustomerCollBean");
    	System.out.println(cus);
    }
    public static void PrintFormat(String str) {
    	int i=20;
    	int a=0;
    	a=i-str.length()/2;
    	StringBuffer sb=new StringBuffer();
    	for(int j=0;j<a;j++) {
    		sb.append("-");
    	}
    	System.out.println(">>>>>>>>>>====="+sb.toString()+str+sb.toString()+"=====<<<<<<<<<<");
    }
}
