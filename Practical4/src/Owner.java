/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZY
 */
public class Owner {
    private String name;
    private String icNo;
    
    public Owner(String name,String icNo){
        this.name=name;
        this.icNo=icNo;
    }
    
    public String toString(){
        
       return String.format("%-15s%-15s", this.name, this.icNo);
    }
}
