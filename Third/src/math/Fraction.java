package math;

import tools.MyMath;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(){
		
		this(1,2);
	}
	
	public Fraction(int numerator, int denominator){
		
		this.numerator = numerator / MyMath.greatestCommonDivisor(numerator, denominator);
		
		this.denominator = denominator / MyMath.greatestCommonDivisor(numerator, denominator);
	}
	
	public int getNumerator(){
		
		return this.numerator;
	}
	
	public int getDenominator(){
		
		return this.denominator;
	}
	
	public void setNumerator(int numerator){
		
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator){
		
		this.denominator = denominator;
	}
	
	public boolean equalNumerator(Fraction fraction){
		
		if(this.numerator == fraction.getNumerator()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean equalDenominator(Fraction fraction){
		
		if(this.numerator == fraction.getDenominator()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean equals(Fraction fraction){
		
		if(equalNumerator(fraction) && equalDenominator(fraction)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Fraction sum(Fraction fraction){
		
		return new Fraction(((this.numerator * fraction.getDenominator())+(fraction.getNumerator() * this.denominator)),(this.denominator * fraction.getDenominator()));
	}
	
	public Fraction subtract(Fraction fraction){
		
		return new Fraction(((this.numerator * fraction.getDenominator())-(fraction.getNumerator() * this.denominator)),(this.denominator * fraction.getDenominator()));
	}
	
	public Fraction multiply(Fraction fraction){
		
		return new Fraction((this.numerator * fraction.getNumerator()),(this.denominator * fraction.getDenominator()));
	}
	
	public Fraction divide(Fraction fraction){
		
		return new Fraction((this.numerator * fraction.getDenominator()),(this.denominator * fraction.getNumerator()));
	}
	
	public String toString(){
		
		return this.numerator + "/" + this.denominator;
	}

}
