package org.SpringCoreBeans.StandAloneCollections;

import java.util.List;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Properties properties;


    public Person() {
    }

    public Person(List<String> friends) {
        this.friends = friends;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", properties=" + properties +
                '}';
    }
}
