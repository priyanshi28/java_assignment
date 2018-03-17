package sprencorenew;

import org.springframework.beans.factory.*;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Dwaring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Traingle triangle =( Traingle) context.getBean("triangle");
		triangle.draw();
	}

}
