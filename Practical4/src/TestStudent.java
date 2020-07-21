/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZY
 */
public class TestStudent {
    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student("19WMD00288","Joey");
        
        stud1.setName("John");
        stud1.setID("19WMD00222");
        
        stud1.addQuiz(8);
        stud2.addQuiz(5);
        
        stud1.addQuiz(8);
        stud2.addQuiz(5);
        
        System.out.println(stud1.getAverageScore());
        System.out.println(stud1.getTotalScore());
        System.out.println(stud2.getAverageScore());
        System.out.println(stud2.getTotalScore());
        
        Student.setContribution(20);
       
    }
}
