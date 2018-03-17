package com.candidjava;
 
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
 
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
 
public class EmpMain {
    public static void main(String a[]) {
 
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
                "config\\spring-config.xml"));
        Emp student = (Emp) factory.getBean("emp");
 
        List studentList = student.getEmpList();
        Iterator iterator = studentList.iterator();
        System.out.println("Employees Names:");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
 
            System.out.println(obj);
            System.out.println();
        }
    }
 
}
