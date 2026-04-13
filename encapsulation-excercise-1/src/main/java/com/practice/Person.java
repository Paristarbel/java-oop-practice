package com.practice;

public class Person {

    // TODO: add private field
    private String name;
    
    public Person(){
        this.name="Unknown";
    }

    public Person(String name){
        this.name=name;
    }
    // TODO: implement setter

    public void setName(String name){
        this.name=name;
    }


    // TODO: implement getter
    public String getName(){
        return name;
    }
}
