package org.SpringCoreBeans.Autowiring.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//there plases where we can use auto wire
//1.above property--here it will call the parametrised constructor for setting the value of dependency object
//2.above setterMethod--here it will call setter method to insert the dependency object value and Default constructor for object creation
public class Employee {
    //    @Autowired
    private Department department;

    public Employee(Department department) {
        System.out.println("parametrised constructor for object creation of Employee");
        this.department = department;
    }

    public Employee() {
        System.out.println("Default constructor for object creation of Employee");
    }

    public Department getDepartment() {
        return department;
    }

    @Autowired
    @Qualifier("depatment2")
//whent we have more than one bean for injection then we use this to specify which bean to select
    public void setDepartment(Department department) {
        System.out.println("Setter method of department is inkoved to set values");
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                '}';
    }
}
