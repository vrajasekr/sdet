
package sdet_java;
public class Activity1_1_Class {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.make = 2021;
        toyota.color = "Silver";
        toyota.transmission = "Manual";
    
        //Using Car class method
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();
    }
}
