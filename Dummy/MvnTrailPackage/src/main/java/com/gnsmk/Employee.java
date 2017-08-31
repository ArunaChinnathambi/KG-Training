package com.gnsmk;

public class Employee {

    String id, name, age, country;

    public Employee setId(String id) {
        this.id = id;
        return this;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Employee setAge(String age) {
        this.age = age;
        return this;
    }

    public Employee setCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        return "{" + id + "::" + name + "::" + age + "::" + country + "}";
    }
}