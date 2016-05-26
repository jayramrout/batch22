package jrout.tutorial.controlStatement;

import jrout.tutorial.operators.Calculator;

public class ClientProgram {

	public static void main(String[] args) {
		int value = Calculator.calcuate(3, 5);
		System.out.println(value);
		System.out.println(Calculator.calcuate(3, 5));
	}
}
