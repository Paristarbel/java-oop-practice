package com.practice;

public class Person {

    // TODO: add private fields
    private String name;
    private int age;
    private double height;

    public Person(){
        this.name="Unknown";
        this.age=0;
        this.height=0;
    }
    public Person(String name,int age,double height){
        this.name=name;
        setAge(age);
        setHeight(height);
    }

    // TODO: implement setters
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age <0 || age >130){
            System.out.println("Age must be greater than 0 and less than 130");
        }else{
            this.age=age;
        }

    }
    public void setHeight(double height){
        if(height <0 || height >3000){
            System.out.println("Age must be greater than 0 and less than 300");
        }else{
            this.height=height;
        }

    }
    // TODO: implement getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getHeight(){
        return this.height;
    }
}
