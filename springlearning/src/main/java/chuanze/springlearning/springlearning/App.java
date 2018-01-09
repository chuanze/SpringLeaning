package chuanze.springlearning.springlearning;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import chuanze.springlearning.javaconfig.HelloWorldImpl;
import chuanze.springlearning.javaconfig.PeopleImpl;
import chuanze.springlearning.people.Student;
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
