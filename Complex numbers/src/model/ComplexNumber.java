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

}
