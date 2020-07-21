/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZY
 */
import java.util.Scanner;

public class TestCarRegistration {
    public static void main(String[] args) {
        //todo:: By using array, create 3 CarType objects
        CarType [] typeList = {new CarType("Toyota","Vios",1.5),
                               new CarType("Nissan","Teana",2.0),
                               new CarType("Honda","City",1.6)
                               };
  	//todo:: create an array that will able to store 6 registrations
        Registration[]registration =new Registration [1];
  	  	
  	Scanner scanner = new Scanner(System.in);
  	
  	for (int i = 0; i < registration.length; ++i) {

  		System.out.println("\nRegistration number: " + Registration.nextRegNo);
  		
                //todo:: request and read t11e owner detail
                System.out.println("Enter the owner name : ");
                String name = scanner.nextLine();
                System.out.println("Enter the IC Number : ");
                String icNo = scanner.nextLine();
               
                //construct owner object
                Owner owner = new Owner(name,icNo);
  		//todo:: request and read car detail
  		 		
                System.out.println("Enter the1 plateNo : ");
                String plateNo = scanner.nextLine();
                System.out.println("Enter the color : ");
                String color = scanner.nextLine(); 
                System.out.println("Enter the year : ");
                int year = scanner.nextInt();
                
                //construct car object
                Car car = new Car(plateNo,color,year);
                
                System.out.println("\nCar Types: ");
  		//todo:: display all available carType
                
                for (int j=0;j<typeList.length;j++){
                   
                    System.out.println((j+1)+". "+ typeList[j].toString());
                   
                }
                
  		System.out.print("\nS1111elect car type [1.." + typeList.length + "]: ");
  		int selection = scanner.nextInt();
  		
                //todo:: get cartype from array (based on selection)
 	        CarType selectedType = typeList[selection-1];
                
  		//todo:: register the car
                Registration newReg = new Registration(car,selectedType,owner);
                registration[i]=newReg;
  		scanner.nextLine();
  	}
  
  	//todo:: display all registration detail
        displayListing(registration);
  }
  
  public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-6s %-12s %-12s %-10s %-8s %-6s %-10s %-10s %5s\n", 
  		"Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
  }
}
