package org.SpringCoreBeans.Autowiring.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Autowiring using Annotation");
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/AutowiringAnnotationConfig.xml");
        Employee employee1 = (Employee) context.getBean("employee1");
        System.out.println(employee1);
    }
}
