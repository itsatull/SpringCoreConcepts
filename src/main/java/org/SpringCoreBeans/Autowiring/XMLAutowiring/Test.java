package org.SpringCoreBeans.Autowiring.XMLAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Autowiring for Dependecy Injection");
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/XMLAutowiringConfig.xml");
//        Employee employee1 = (Employee) context.getBean("employee1");
//        System.out.println(employee1);
        Employee employee2 = (Employee) context.getBean("employee2");
        System.out.println(employee2);
    }
}
