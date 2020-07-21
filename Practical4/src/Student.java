/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZY
 */
public class Student {
    
     private String studentID;
     private String name;
     private int quiz;
     private int mark;
     private static int contribution;
   
     
    public Student(){
        /*studentID="";
        name="";
        quiz=0;
        mark=0;*/
        
        this("","");
    }
    
    public Student (String studentID,String name){
        this.studentID=studentID;
        this.name=name;
        quiz=0;
        mark=0;
    }
    
    public static void setContribution(int c){
        contribution=c;
    }
    public static int getContribution(){
        return contribution;
    }
    public void addQuiz(int score){
        mark+=score;
        quiz+=1;
    }
    public int getTotalScore(){
        return mark;
    }
    public double getAverageScore(){
        return (double)mark/quiz;
    }
        
    public void setID(String studentID){
    this.studentID=studentID;
    }
 
    public void setName(String name){
    this.name= name;
    }
    
    public String getStudentID(){
     return studentID;
 }
    public String getName(){
     return name;
 }
 public int getQuiz(){
     return quiz;
 }
public int getMark(){
     return mark;
 }

    
    
}
