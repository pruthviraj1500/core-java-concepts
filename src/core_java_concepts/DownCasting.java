package core_java_concepts;

class Parent{
    String name;
    void show(){
        System.out.println("This is show method");
    }
    void greed(){
        System.out.println("This is greed method in Parent class ");
    }
}

class Child extends Parent{
    int age;
     void show(){
        System.out.println("This is show method in Child class");
    }
}

public class DownCasting {

    public static void main(String[] args){

        Parent p = new Parent();
        p.name = "Pruthvi";
        Child c = null;
        if(p instanceof Child){
            c = (Child) p; //This is downcasting
            c.age = 23;
        }else {
            System.out.println("DownCasting is not possible");
        }

//        Child c = (Child) p;   

        System.out.println(c.name+"    "+c.age);
        c.greed();
        c.show();

    }

}
