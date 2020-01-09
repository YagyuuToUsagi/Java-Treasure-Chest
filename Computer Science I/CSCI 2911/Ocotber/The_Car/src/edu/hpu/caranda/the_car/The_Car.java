
package edu.hpu.caranda.the_car;
import java.io.*;

public class The_Car {

    public static void main(String[] args) {
        
        Car vehicle= new Car(20,40);
        
        vehicle.fillTank();
        vehicle.drive(5);
        vehicle.getCurrentGas();            
        }
    
    }
    

