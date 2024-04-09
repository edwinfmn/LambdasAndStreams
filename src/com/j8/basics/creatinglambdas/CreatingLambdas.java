package com.madhusudhan.j8.basics.creatinglambdas;

/**
 * Creating a lambda expression
 * 
 * @author mkonda
 */
public class CreatingLambdas {

	interface Greeting{
		String saluda(String g);

	}
	
	public void testGreeting(String a, Greeting g){
		String result = g.saluda(a);
		
		System.out.println("Result:"+result);
	}
	
	public static void main(String[] args) {
		//input -> body
//		(String s) -> "Hello, "+s;
		new CreatingLambdas().testGreeting("Harry", g -> "Hello, " + g );
		
		new CreatingLambdas().testGreeting("Miss Pingu",(String s) -> "Hello, "+s );
		
		// (String p) -> !p.isEmpty()? "Howdy, "+p :"Did you miss something?"
		new CreatingLambdas().testGreeting("",
				(String p) -> !p.isEmpty()? "Howdy, "+p :"Did you miss something?");

		new CreatingLambdas().testGreeting("Sr. Edwin", x -> "Hola, buen día " + x);
		
	}
}








