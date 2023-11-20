package org.SpringCoreBeans.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//1.initializingBean
//2.
public class BooksLifeCycleUsingInterface implements InitializingBean, DisposableBean {

    private double price;

    public BooksLifeCycleUsingInterface() {
        System.out.println("Default constructor is used for object creation");
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
        return "BooksLifeCycleUsingInterface{" +
                "price=" + price +
                '}';
    }

    public void afterPropertiesSet() throws Exception {
        //we write our buisness logic about the Bean like getting db-connection etc
        System.out.println("Reading the book");

    }

    public void destroy() throws Exception {
        //we write our code before destroying the bean like closinng db-cnnection
        System.out.println("going to sell the book");
    }
}
