package com.FunctionalInterface;

public class MethodReferanceForParameter {
	public static void main(String[] args) 
	{
		MethodReferanceForParameter mr=new MethodReferanceForParameter();
		
		Demo d=MethodReferanceForParameter::M;
		String s=d.demo(mr);
		System.out.println(s);
	}
	
	public String M()
	{
		return "HI";
	}
}

@FunctionalInterface
interface Demo
{
	String demo(MethodReferanceForParameter mrd);
}
