package com.practice;

public class Person {

    // TODO: private fields
    private String name;
    private int age;

    // TODO: default constructor
    public Person(){
        this.name="Unknown";
        this.age=0;

    }
    

    // TODO: parameterized constructor
    public Person(String name,int age,double height,double weight){
        this.name=name;
        setAge(age);

    }

    // TODO: setters
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

    // TODO: getters
        public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }


    // TODO: isAdult()
      public boolean isAdult(){
        return age >=18;

    }


}
