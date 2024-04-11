package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobsalary = 600;
        int garysalary = 300;
        int highestsalary = Math.max(bobsalary, garysalary);
        System.out.println("the highest salary is "+ highestsalary);

        int carprices= 1000;
        int truckprice= 5000;
        int minprice = Math.min(carprices, truckprice);
        System.out.println("the lowest price is " + minprice);


        double radius= 7.25;
        double areaOfCircle= Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle with" + radius  + areaOfCircle);





    }
}
