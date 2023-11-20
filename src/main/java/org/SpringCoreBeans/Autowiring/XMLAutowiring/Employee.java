package org.SpringCoreBeans.Autowiring.XMLAutowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    @Autowired
    private Parent parent;

    public Employee(Parent parent) {
        System.out.println("parametrised constructor is used for Object Creation");

        this.parent = parent;
    }

    public Employee() {
        System.out.println("default constructor is used fo object creation");

    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        System.out.println("setter method is used for setting the value of dependency");
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " parent=" + parent +
                '}';
    }
}
