package com.Santana.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setNum1(10.5);
		calc.setNum2(5.2);
		calc.setOperation("+");
		calc.performOperation();
		calc.getResults();

	}

}
