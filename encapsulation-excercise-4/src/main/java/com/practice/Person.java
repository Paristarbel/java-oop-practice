package com.practice;

public class Person {

    // TODO: add private fields
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(){
        this.name="Unknown";
        this.age=0;
        this.height=0;
        this.weight=0;
    }
    public Person(String name,int age,double height,double weight){
        this.name=name;
        setAge(age);
        setHeight(height);
        setWeight(weight);
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
        if(height <0){
            System.out.println("Height must be greater than 0");
        }else{
            this.height=height;
        }

    }
    public void setWeight(double weight){
        if(weight <0){
            System.out.println("Height must be greater than 0");
        }else{
            this.weight=weight;
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
    public double getWeight(){
        return this.weight;
    }

    public boolean isAdult(){
        return age >=18;

    }
    public double calculateBMI(){
        double BMI= weight/(height*height);
            return BMI;

    }


}
