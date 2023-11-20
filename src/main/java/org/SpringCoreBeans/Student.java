package org.SpringCoreBeans;

public class Student {
    private Long studentId;
    private String studentName;
    private String studentAddress;

    public Student(Long studentId, String studentName, String studentAddress) {
        System.out.println("Student Class Parameterised Constructor is invoked");
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
        System.out.println("Default constrctor ivoked while creating object");
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("Setting student Address");
        this.studentAddress = studentAddress;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        System.out.println("Setting student Id");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("Setting student name");
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
