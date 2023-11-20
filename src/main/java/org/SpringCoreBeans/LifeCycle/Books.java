package org.SpringCoreBeans.LifeCycle;

public class Books {
    //Set some properties
    private double price;

    public Books() {
        super();
        System.out.println("Creating object using Default Constructor");
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
        return "Books{" +
                "price=" + price +
                '}';
    }

    public void init() {
        System.out.println("Inside init method");
    }

    public void destroy() {
        System.out.println("Inside Destroy Method");
    }
}
