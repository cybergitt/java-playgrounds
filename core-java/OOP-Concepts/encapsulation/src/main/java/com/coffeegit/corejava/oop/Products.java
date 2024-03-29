package com.coffeegit.corejava.oop;

public class Products {
    private long id;
    private String code;
    private String name;
    private double price;

    public Products() {
        //
    }

    public Products(long id, String code, String name, double price) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription(String code) {
        return code.concat(" - ").concat(this.name);
    }
}