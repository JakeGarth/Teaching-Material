package com.company;

public class Person {
    private String firstName;
    private double weight, height;
    public String test;

    public String getFirstName(){
        return firstName;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setHeight(double height){
        this.height = Math.abs(height);
    }

    public void setWeight(double weight){
        this.weight = Math.abs(weight);
    }

    public Person(double weight, double height, String name){
        setFirstName(name);
        setHeight(height);
        setWeight(weight);
    }

    public double getBMI(){
        return getWeight()/Math.pow(getHeight(),2);
    }
}

