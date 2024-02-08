package mycarapp;

import java.util.Scanner;


public class MyCarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BuildCar testCar1 = new BuildCar();
        
        System.out.println("Status at Start\n");
        testCar1.startTest();
        testCar1.hitGas(50);
        testCar1.hitBreak(10);
        testCar1.hitGas(20);
        testCar1.addMiles(100);
        testCar1.addMiles(20);
        testCar1.checkFuel_gauge(10);
        testCar1.changeDirection(90);
        testCar1.endTest();
        
        Scanner input = new Scanner(System.in);
        new testCar2 = input.nextInt();
        BuildCar testCar2 = new BuildCar();
        
        testCar2.hitGas(testCar2);
        testCar2.hitGas(testCar2);
        testCar2.hitGas(testCar2);
        testCar2.changeDirection(testCar2);
        testCar2.changeDirection(testCar2);
        testCar2.endTest();
    }
}