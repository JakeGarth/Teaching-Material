package com.company;

public class Main {

    public static void main(String[] args) {
	Person Jake = new Person(68.3, 1.7, "Jake");
	Person William = new Person(90.4, 2.0, "William");

	System.out.println(BMICalc(1.8,70));

	System.out.println("William Weight: "+William.getWeight());
	System.out.println("William BMI: "+William.getBMI());

	String nullTest = null;

	String test = "test";
	String[] a = {"Hey", "12"};
	String notATest = "tes";

	notATest = notATest + "t";
	System.out.println(notATest);

	if(test.equals(notATest)){
	    System.out.println(".equals works");
    }

        if(test == notATest){
            System.out.println("== works");
        }
















        System.out.println("----------------------");
	//Square square1 = new Square(5,5);
	//Square square2 = new Square(3,3);

	//System.out.println("Square1 Area: "+square1.getArea());
	//System.out.println("Square2 Area: "+square2.getArea());
    }


    public static double BMICalc(double height, double weight){
        return weight/Math.pow(height,2);
    }
}


