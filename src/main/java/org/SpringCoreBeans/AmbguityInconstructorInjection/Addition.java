package org.SpringCoreBeans.AmbguityInconstructorInjection;

public class Addition {
    private Integer a;
    private Integer b;

    public Addition(String a, String b) {
        System.out.println("Constructor With both the parameter String is Invoked");
        this.a = Integer.valueOf(a);
        this.b = Integer.valueOf(b);
    }

    public Addition(Integer a, Integer b) {
        System.out.println("Constructor With both the parameter as Integer is Invoked");
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Addition{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
