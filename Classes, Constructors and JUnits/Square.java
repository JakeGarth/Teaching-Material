package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Square {
    private double height, length;
    public int [] arr;

    public int[] getArr(){
        return this.arr;
    }
    public void setArr(int[] newArray){
        System.out.println("newArray: "+ Arrays.toString(newArray));
        if(newArray == null){
            System.out.println("newArray in if statement");
            this.arr = new int[0];
        }
        this.arr = newArray;
    }


    public double getHeight(){
        return height;
    }

    public double getLength(){
        return length;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setLength(double length){
        this.length = length;
    }

    public Square(double length, double height, int[] newArray){
        setLength(length);
        setHeight(height);
        setArr(newArray);
    }

    public double getArea(){

        return Math.abs(getHeight())*Math.abs(getLength());
    }
}
