package com.FunctionalInterface;

public class WriteLambdaWithArguments {
	
	public static void main(String[] args) {
		/** 0 arguments **/
		P ref=() -> System.out.println("Hi");
		ref.f();
		
		/** 1 arguments **/
		
		//first type
		P1 ref1=(String temp) -> System.out.println(temp);
		ref1.f1("demo");
		
		//second type
		P1 ref2=(t) -> System.out.println(t);
		ref2.f1("demo1");
		
		//third type
		P1 ref3=t1 -> System.out.println(t1);
		ref3.f1("demo2");
		
		/** 2 arguments **/
		 //first way
		 P2 ref4=(String one,String two) ->{
			 System.out.println(one+" "+two);
		 };
		 ref4.f2("one","two");
		
		 //second way
		 P2 ref5=(one,two) ->
		 	System.out.println(one+" "+two);
		 	ref5.f2("ONE","TWO");
		 	
//		 //third way	
//		 P2 ref6=(var one,var two) ->
//		 {
//			 System.out.println(one + " "+ two);
//		 }
//		 ref6.f2("one","two");
		
	}
}
@FunctionalInterface
interface P
{
	public void f();
}

@FunctionalInterface
interface P1
{
	public void f1(String s);
}

@FunctionalInterface
interface P2
{
	public void f2(String s1,String s2);
}
