package com.example.designpatterns.behavioralPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private double itemCost;

    private double discount;

    private int count;

    private double shippingCost;

    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String id) {
        this.id = id;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public double getItemCost() {
        return itemCost - discount + shippingCost;
    }

    public int getCount() {
        return count;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void addItem(double price) {
        itemCost += price;
        count++;
        observers.forEach(observer -> observer.updated(this));
    }

    @Override
    public String toString() {
        return "Order " +
                "id='" + id + '\'' +
                ", itemCost=" + itemCost +
                ", discount=" + discount +
                ", count=" + count +
                ", shippingCost=" + shippingCost +
                ", totalCost=" + getItemCost();
    }
}
