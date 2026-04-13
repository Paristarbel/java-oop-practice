package com.practice;

public class Person {

    // TODO: add private age field
    private int age;

    public Person(){
        this.age=0;
    }
    public Person(int age){
        setAge(age);
    }
    // TODO: implement setter
    public void setAge(int age) {
        if (age < 0 || age > 130) {
            System.out.println("Age cannot be negative or greater than 130");
        } else {
            System.out.println(this.age);
        }
    }
    // TODO: implement getter

    public int getAge(){
        return this.age;
    }


}
