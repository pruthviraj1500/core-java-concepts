package interview_preparation;

abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{
    void draw(){
        System.out.println("Circle drawn");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle drawn");
    }
}

public class Snippet3 {

    public static void main(String[] args){

        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();
    }
}
