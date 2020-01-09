package edu.hpu.caranda.the_car;

public class Car {

    double tank_size, mileage, current_gas;

    public Car(double tank_size, double mileage) { //Constructor rules
        this.tank_size = tank_size;                //1. Name matches the class name
        this.mileage = mileage;                    //2. Has NO return type
        this.current_gas = tank_size;
    }
    
    public void fillTank() {
        current_gas = tank_size;

    }
    public void drive(double miles){
        current_gas-=miles/mileage;
    }
    
    public double getCurrentGas(){
        return current_gas;
    }

}
