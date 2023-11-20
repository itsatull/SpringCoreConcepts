package org.SpringCoreBeans.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsTest {
    public static void main(String[] args) {
        System.out.println("all test for collections");
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/Collections/CollectionConfig.xml");
        Employee employee = (Employee) context.getBean("employee1");
        System.out.println("Employee Name " + employee.getName());
        System.out.println("courses " + employee.getCourses());
        System.out.println("Address " + employee.getAddresses());
        System.out.println("Map type " + employee.getCourses().getClass().getName());
        System.out.println("List Type" + employee.getPhones().getClass().getName());
        System.out.println("Set type" + employee.getAddresses().getClass().getName());


    }
}
