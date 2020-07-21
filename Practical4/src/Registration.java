/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZY
 */
public class Registration {
    static int nextRegNo=1001;
    private static int regNo;
    private Car car;
    private CarType carType;
    private Owner owner;

    public Registration(Car car, CarType carType, Owner owner) {
        this.car = car;
        this.carType = carType;
        this.owner = owner;
        regNo=nextRegNo;
        nextRegNo++;
    }
    
   
    public String toString(){
        
       return String.format("%-2d%s%s%s",regNo,owner.toString(),car.toString(),carType.toString());
    }

    
}
