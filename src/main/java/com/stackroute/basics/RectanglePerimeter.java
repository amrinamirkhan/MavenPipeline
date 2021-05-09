package com.stackroute.basics;


import java.util.Scanner;

public class RectanglePerimeter
{
    public static void main(String[] args)
    {
        new RectanglePerimeter().getValues();

    }

    //get user input from console
    public void getValues()
    {
        Scanner scanner=new Scanner(System.in);

        //System.out.println("Enter length and breadth of the rectangle: ");
        double length=scanner.nextDouble();
        double breadth=scanner.nextDouble();
        double result=new RectanglePerimeter().perimeterCalculator(length,breadth);
        System.out.println(result);




    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth)
    {
        double perimeter;
        perimeter=2*(length+breadth);
        return perimeter;
    }
}
