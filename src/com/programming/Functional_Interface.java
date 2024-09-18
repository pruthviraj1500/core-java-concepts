package com.programming;

/*
  --- In this, implement functional interface using Normal class, Anonymous class and Lambda expression
 */

@FunctionalInterface
interface A {

    void show(int a , int b);

    default void show2(int a){
        System.out.println(a);
    }
    // public void  multiply();    Can't add more than one method in functional interface
}

/*

//Implementing interface using normal class
class Demo implements A {

	@Override
	public void show(int a , int b) {
		int c = a+b;
		System.out.println("addition of two numbers : "+c);

	}
}
*/

public class Functional_Interface {

    public static void main(String[] args){

        /*

		Demo obj = new Demo();
		obj.show(10, 20);

*/

/*

		A obj = new A()          //Anonymous class
		{
			@Override
			public void show(int a , int b) {
				int c = a+b;
				System.out.println("addition of two numbers : "+c);
			}
		};

		obj.show(10, 20);

*/

        A obj = ( a ,  b) ->         //Lambda Expression
        {
            int c = a+b;
            System.out.println("addition of two numbers : "+c);
        };

        obj.show(10, 20);

    }

}

