package io.erehsawsaltul.springcore.constructorinjection;

public class Ambiguity {
	Ambiguity(int a, double b) {
		System.out.println("Inside Constructor");
		System.out.println(a);
		System.out.println(b);
	}

}
