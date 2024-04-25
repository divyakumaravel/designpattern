package com.example.designpatterns.behavioralPattern.strategyPattern;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private String id;
    private LocalDate date;
    private Map<String, Double> items = new HashMap<>();
    private Double total;

    public Order(String id) {
        this.id = id;
        date = LocalDate.now();
    }

    public void addItem(String item, Double price) {
        items.put(item, price);
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public Double getTotal() {
        return total;
    }
}
