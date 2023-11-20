package org.SpringCoreBeans.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BooksLifeCycleAnnotations {
    private double price;

    public BooksLifeCycleAnnotations() {
        System.out.println("creating object using default Constructor");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "BooksLifeCycleAnnotations{" +
                "price=" + price +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("inside init Method using annotation - @PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("inside Destroy Method using annotation - @PreDestroy");
    }


}
