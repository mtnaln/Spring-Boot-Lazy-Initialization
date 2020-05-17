package com.metin.spring.boot.lazy.initialization.models;

public class Phone {
    private String name;
    private String model;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
        System.out.println("Phone constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
