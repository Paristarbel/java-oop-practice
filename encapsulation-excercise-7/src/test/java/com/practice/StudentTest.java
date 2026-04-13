package com.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// Class
// import java.util.ArrayList;

// public class Student {

//     // TODO: add private fields
//     private String name;
//     private ArrayList<Integer> scores;

//     public Student(){
//         this.name="Unknown";
//         this.scores= new ArrayList<>();

//     }
//     public Student(String name, ArrayList scores){
//         this.name=name;
//         this.scores=scores;


//     }

//     // TODO: implement setters
//     public void setName(String name,ArrayList scores){
//         this.name=name;
        
//     }
//     public double addScores(int score){
//             if(score >0 || score<= 100){
//                 scores.add(score);
                
//         }
//         return 0;
//     }
//     // TODO: implement getters
//     public String getName(){
//         return this.name;
//     }
//     public ArrayList<Integer> getScores(){

//         return this.scores;
//     }

//     public double getAverageScore(){

//         if(scores.size() == 0){
//             return 0;
//         }
//         int sum=0;
//         for(int score : scores){
//             sum+=score;
//         }
//         return ((double) sum/scores.size());

//     }



// }

class StudentTest {

    @Test
    void shouldStoreName() {

        Student student = new Student();

        student.setName("Alice");

        assertEquals("Alice", student.getName());
    }

    @Test
    void shouldAddValidScores() {

        Student student = new Student();

        student.addScore(80);
        student.addScore(90);

        assertEquals(2, student.getScores().size());
    }

    @Test
    void shouldRejectInvalidScores() {

        Student student = new Student();

        student.addScore(50);
        student.addScore(150); // invalid

        assertEquals(1, student.getScores().size());
    }

    @Test
    void shouldCalculateAverage() {

        Student student = new Student();

        student.addScore(80);
        student.addScore(100);

        assertEquals(90, student.getAverageScore());
    }

    @Test
    void averageShouldBeZeroIfNoScores() {

        Student student = new Student();

        assertEquals(0, student.getAverageScore());
    }

}
