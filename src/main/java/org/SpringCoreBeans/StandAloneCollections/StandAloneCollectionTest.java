package org.SpringCoreBeans.StandAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAloneCollectionTest {
    public static void main(String[] args) {
        System.out.println("stand alone collection test");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/StandAloneCollectionConfig.xml");
        Person person = (Person) applicationContext.getBean("person1");
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());
        System.out.println(person.getProperties().getClass().getName());
    }
}
