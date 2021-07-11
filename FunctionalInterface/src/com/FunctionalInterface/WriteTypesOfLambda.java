package com.FunctionalInterface;

public class WriteTypesOfLambda {

	public static void main(String[] args) {
	/** return type void*/	
		//first way
		K ref=() -> {System.out.println("Hi");};
		ref.f1();
		//second way
		K ref1=() -> System.out.println("Hi");
		ref1.f1();
		
	/** return type not void*/	
		//first way
		B ref2=() ->{
				return "hi";
			};
		ref2.f2();
		//second way
		B ref3=() -> "second way :: hi";
		String s1=ref3.f2();
		System.out.println(s1);
	
	/** Multiple Statement 
	 	return type :: void **/
		C ref4=() -> {
			System.out.println("Hi");
			System.out.println("Demo");
		};
		ref4.f();
	
	/** Multiple Statement 
	 	return type :: not void **/
		D ref5=() -> {
			System.out.println("Hi");
					return "bye";
		};
		String s=ref5.f3();
		System.out.println(s);
		
	}
}

@FunctionalInterface
interface K
{
	void f1();
}

@FunctionalInterface
interface B
{
	String f2();
}

@FunctionalInterface
interface C
{
	public void f();
}

@FunctionalInterface
interface D
{
	public String f3();
}