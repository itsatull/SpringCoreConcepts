package org.SpringCoreBeans.Autowiring.Annotation;

public class Department {
    private String departmentName;

    public Department() {
        System.out.println("Default Constructor is used to create object of Department");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        System.out.println("setter method is used to set value of department object");
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }
}
