package com.prog.exceptionhandling;

public class MethodOverridingException extends MOPrentMenthodProg {

	public void parentMethod() throws Exception{
		System.out.println("Child Method");
	}

	public static void main(String[] args) {

		MOPrentMenthodProg obj = new MethodOverridingException();

		try {
			obj.parentMethod();

		} catch (Exception e) {

		}
	}

}
