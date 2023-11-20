package org.SpringCoreBeans.DependencySetterInjection;

import org.SpringCoreBeans.Student;

public class Parent {
    private String parent;
    private Student student;


    public Parent(Student student, String parent) {
        System.out.println("parent class parametrized constructor is invoked");
        this.student = student;
        this.parent = parent;
    }

    public Parent() {
        System.out.println("parent  default constructor is invoked");
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        System.out.println("Set parent name");
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "student=" + student +
                ", parent='" + parent + '\'' +
                '}';
    }
}
