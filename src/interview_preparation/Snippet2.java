package interview_preparation;

class Animal{
    public void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog Barks");
    }
}

public class Snippet2 {

    public static void main(String[] args){
        Animal a = new Dog();
        a.sound();
    }
}

/*
   Output : "Dog Barks"
   B'coz we are doing here a upcasting and Due to upcasting using reference of Parent class we are calling only
   overridden methods at runtime.
   This is dynamic method dispatch
 */