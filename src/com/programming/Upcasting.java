package com.programming;

class UParent{
    void greet(){
        System.out.println("In Parent greet method");
    }

    void showMessage(){
        System.out.println("In Parent showMessage method");
    }
}

class UChild extends UParent{

    @Override
    void greet(){
        System.out.println("In Child greet method");
    }

    void show(){
        System.out.println("In Child show method");
    }
}

public class Upcasting {

    public static void main(String[] args){
        System.out.println("In main method");

        UParent p = new UChild();  //This is Upcasting
       //UChild u = (UChild) new UParent();
        p.greet();
        p.showMessage();

    }

}
