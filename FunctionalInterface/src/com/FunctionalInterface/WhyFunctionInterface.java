package com.FunctionalInterface;

/**
 * 
 * @author baghel mit
 *
 */
public class WhyFunctionInterface{
	//using Lambda Expression
	//lambda is not overRaiding method
	public static void main(String[] args) 
	{
		A ref= () -> {System.out.println("body of method");};
		ref.abstractMethod();
	}
}

class WithoutLambda extends WhyFunctionInterface implements A 
{
	@Override
	public void abstractMethod() {
		System.out.println("body of method");
	}
	
	public static void main(String[] args) {
		WithoutLambda wl=new WithoutLambda();
		wl.abstractMethod();
	}
	
}

@FunctionalInterface
interface A
{
	void abstractMethod();
	
	default void f1() {}
	default void f2() {}
	default void f3() {}
}
