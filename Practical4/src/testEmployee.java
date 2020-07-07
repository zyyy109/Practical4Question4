/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZY
 */
public class testEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ali",4000);
        Employee emp2 = new Employee ("Abu");
        emp2.setSalary(5000);
        
        if(emp1.getSalary() > emp2.getSalary()){
            System.out.println("Name : " + emp1.getName());
        }else
            System.out.println("Name : " + emp2.getName());
       
        System.out.println("Total Salary : " + (emp1.getSalary()+emp2.getSalary()));
    }
}
