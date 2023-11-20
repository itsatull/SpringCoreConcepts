package org.SpringCoreBeans.SterioTypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("student")
@Scope("prototype")
//@Component tells Ioc container to create the object of this class with name student
public class Student {
    @Value("Ravi")
    //@Value operation we set the Default value of Attributes when objects is created
    private String name;
    @Value("Bhopal")
    private String city;
    @Value("#{phoneno}")
    private List<String> contacts;

    @Value("#{ T(java.lang.Math).sqrt(100) }") //sqrt is a static method in java.lang.Math
    private double marks;
    @Value("#{ T(java.lang.Math).PI }")//PI is a static variable in java.lang.Math
    private double age;

    public Student() {
        System.out.println("Default Constructor of Student Class is used to create the object");
    }

    public Student(String name, String city, List<String> contacts,double marks,double age) {
        this.name = name;
        this.city = city;
        this.contacts = contacts;
        this.marks = marks;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter method is used to set name");
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("Setter method is used to set City");
        this.city = city;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", contacts=" + contacts +
                ", marks=" + marks +
                ", age=" + age +
                '}';
    }
}
