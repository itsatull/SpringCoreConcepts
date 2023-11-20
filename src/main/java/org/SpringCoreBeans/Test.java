package org.SpringCoreBeans;

import org.SpringCoreBeans.LifeCycle.BooksLifeCycleAnnotations;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Spring Core");
//        AppicationContext is our interface
//        since our configuration is in class path we will use ClassPathXmlApplicationContext();
//        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/BooksLifeCycleConfig.xml");
//        Books books1 = (Books) context.getBean("Book1");
//        System.out.println(books);-->note ApplicationContext Interface cant call destroy method so we use below one
//        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("META-INF/BooksLifeCycleConfig.xml");
//        Books books = (Books) context1.getBean("Book1");
//        context1.registerShutdownHook();//use to call destroy method
//        AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("META-INF/BooksLifeCycleConfig.xml");
//        BooksLifeCycleUsingInterface books2 = (BooksLifeCycleUsingInterface) context2.getBean("book2");
//        context2.registerShutdownHook();//use to call destroy method
//        System.out.println(books2);
        AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("META-INF/BooksLifeCycleConfig.xml");
        BooksLifeCycleAnnotations books3 = (BooksLifeCycleAnnotations) context2.getBean("book3");
        context2.registerShutdownHook();//use to call destroy method
        System.out.println(books3);

    }
}
