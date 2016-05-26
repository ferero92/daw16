package model;

public class ComplexNumber {
	
	private int a;
	private int b;
	
	public ComplexNumber(String string){
		
		int first;
		int last;
		
		if(string.indexOf('(') == -1){
			first = 0;
			last = 1;
		}
		else{
			first = 1;
			last = 2;
		}
		
		this.a = Integer.parseInt(string.substring(first, string.indexOf('+')));
		this.b = Integer.parseInt(string.substring(string.indexOf('+'), string.length()-last));
	}
	
	public ComplexNumber(int a, int b){
		
		this(new String(a+"+"+b+"i"));
	}
	
	public ComplexNumber sum(ComplexNumber n){
		
		int a = this.getA() + n.getA();
		int b = this.getB() + n.getB();
		
		return new ComplexNumber(a, b);
	}
	
	public ComplexNumber subtraction(ComplexNumber n){
		
		int a = this.getA() - n.getA();
		int b = this.getB() - n.getB();
		
		return new ComplexNumber(a, b);
	}
	
	public ComplexNumber multiplication(ComplexNumber n){
		
		int a = this.getA() * n.getA() - this.getB() * n.getB();
		int b = this.getA() * n.getB() + this.getB() * n.getA();
		
		return new ComplexNumber(a, b);
	}
	
	//<----------------GETTERS AND SETTERS---------------->
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString(){
		
		return new String("("+this.getA()+"+"+this.getB()+"i)");
	}

}
