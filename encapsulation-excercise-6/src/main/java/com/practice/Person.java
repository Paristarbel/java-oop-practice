package com.practice;

// TODO: add private fields
    private String name;
    private int age;
    private static int totalPeople;



    public Person(){
        this.name="Unknown";
        this.age=0;
        totalPeople++;


    }
    public Person(String name,int age){
        this.name=name;
        setAge(age);
        totalPeople ++;

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
    // TODO: implement getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    // TODO: static getter for totalPeople
    public static int getTotalPeople(){
        return totalPeople;
    }
}
