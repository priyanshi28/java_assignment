package org.javabeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
public static void main(String args[])
{
	//Triangle shape= new Triangle();
	//shape.draw();
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
	Triangle triangle=(Triangle)factory.getBean("Tri");
	triangle.draw();
}
	
}
