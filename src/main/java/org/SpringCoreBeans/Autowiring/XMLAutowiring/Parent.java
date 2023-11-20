package org.SpringCoreBeans.Autowiring.XMLAutowiring;

public class Parent {
    private String name;

    public Parent() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                '}';
    }
}
