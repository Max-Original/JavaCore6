package packinterface3;

import packinterface2.Numerable;

public class MyCalculator implements Numerable{
	
	private double firstNumber;
	private double secondNumber;
	private double thirdNumber;
	
	
	
	
	public MyCalculator(double firstNumber, double secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	

	public MyCalculator(double firstNumber, double secondNumber, double thirdNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.thirdNumber = thirdNumber;
	}

	

	public double getFirstNumber() {
		return firstNumber;
	}


	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}


	public double getSecondNumber() {
		return secondNumber;
	}


	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}


	public double getThirdNumber() {
		return thirdNumber;
	}


	public void setThirdNumber(double thirdNumber) {
		this.thirdNumber = thirdNumber;
	}


	@Override
	public double plus() {
		
		return getFirstNumber() + getSecondNumber();
	}

	@Override
	public double minus() {
		
		return getFirstNumber() - getSecondNumber();
	}

	@Override
	public double multiply() {
		
		return getFirstNumber() * getSecondNumber();
	}

	@Override
	public double devide() {
		
		return getFirstNumber() / getSecondNumber();
	}

}
