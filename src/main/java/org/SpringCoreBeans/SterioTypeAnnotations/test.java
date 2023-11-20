package org.SpringCoreBeans.SterioTypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        System.out.println("Steriotype Anootations");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/SteriotypeAnnotationConfig.xml");
        Student student1 = (Student) applicationContext.getBean("student");
//        System.out.println(student1);
//        System.out.println(student1.getContacts());
//        System.out.println(student1.getContacts().getClass().getName());
//        System.out.println(student1.hashCode());
//        Student student2 = (Student) applicationContext.getBean("student");
//        System.out.println(student2.hashCode());
        System.out.println(student1);

    }
}
